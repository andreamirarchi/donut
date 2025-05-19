package com.example.donut;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donut")
public class DonutController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "donut-created";

    public DonutController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/create")
    public String createDonut(@RequestParam String id) {
        String message = "Ciambella pronta";
        kafkaTemplate.send(TOPIC, id, message);
        return "Event sent: " + message;
    }
}