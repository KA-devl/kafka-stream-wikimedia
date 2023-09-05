package com.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
//    @KafkaListener(topics = "wikimedia-topic", groupId="group_id")
//    public void consume(String message) {
//
//           LOGGER.info("Consumed new data! -> " +message);
//    }
}
