package com.yamiy.aws.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yamiy.aws.lambda.model.BuyOrder;
import com.yamiy.aws.lambda.repository.BuyOrderRepository;

@SpringBootApplication
public class AwsLambdaApplication {
	
	@Autowired
	private BuyOrderRepository repository;
	
	@Bean
	public Supplier<List<BuyOrder>> orders() {
		return () -> repository.buildOrders();
	}
	
	@Bean
	public Function<Integer, List<BuyOrder>> findBuyOrderById() {
		return (i) -> repository.buildOrders().stream().filter(order -> order.getName().equals(i)).collect(Collectors.toList());
	}
    
	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaApplication.class, args);
	}
	
	
}
