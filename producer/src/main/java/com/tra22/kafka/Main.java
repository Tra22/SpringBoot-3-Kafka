package com.tra22.kafka;

import com.tra22.kafka.dto.OrderDto;
import com.tra22.kafka.producer.KafkaProducerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.tra22.common"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
            KafkaProducerService kafkaTemplate
    ) {
        return args -> {
            kafkaTemplate.send("order-topic", "orderId", OrderDto.builder().orderId(1).price(100.23).build());
        };
    }
}