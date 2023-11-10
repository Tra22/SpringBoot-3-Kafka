package com.tra22.kafka.producer;

import com.tra22.kafka.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducerService {
    private final KafkaTemplate<String, OrderDto> kafkaTemplate;
    public void send(String topicName, String key, OrderDto value) {
        var future = kafkaTemplate.send(topicName, key, value);
        future.whenComplete((sendResult, exception) -> {
            if (exception != null) {
                future.completeExceptionally(exception);
                log.error("error: ", exception);
            } else {
                future.complete(sendResult);
                log.info("result: {}", sendResult);
            }
            log.info("order producer : {} ", value);
        });
    }
}
