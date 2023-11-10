package com.tra22.kafka.event;

import com.tra22.kafka.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafKaTopicListeners {
    @KafkaListener(topics = {"order-topic"}, groupId = "order-group")
    public void consume(OrderDto orderDto) {
        log.info("order consumer : {} ", orderDto);
    }
}