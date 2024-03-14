package com.example;

import com.example.controller.ProductController;
import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		var repository = context.getBean(ProductRepository.class);

		List<Product> products = List.of(
				new Product(null,"Product1",5.99,1),
				new Product(null,"Product2",7.99,41),
				new Product(null,"Product3",0.99,13),
				new Product(null,"Product4",2.43,2),
				new Product(null,"Product5",7.0,13),
				new Product(null,"Product6",2.55,7)
		);
		repository.saveAll(products);
	}

}
