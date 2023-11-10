package com.tra22.kafka.dto;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto implements Serializable {
    private int orderId;
    private double price;
}
