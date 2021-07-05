package com.yamiy.aws.lambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.yamiy.aws.lambda.model.BuyOrder;

@Repository
public class BuyOrderRepository {
	public List<BuyOrder> buildOrders(){
        return Stream.of(
                new BuyOrder(101, "Mobile", 20000, 1),
                new BuyOrder(102, "Book", 999, 2),
                new BuyOrder(953, "Jeans", 4499, 1)
        ).collect(Collectors.toList());
    }
}
