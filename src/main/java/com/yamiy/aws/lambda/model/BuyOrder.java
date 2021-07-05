package com.yamiy.aws.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuyOrder {

    private int id;
    private String name;
    private double price;
    private int quantity;
}