package com.app.mapstructdemo.test;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.mapstructdemo.dto.GetProduct;
import com.app.mapstructdemo.entity.Product;
import com.app.mapstructdemo.mapper.ProductMapper;
import com.app.mapstructdemo.repository.ProductRepository;

@Configuration
public class InitDatabase {

	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ProductMapper productMapper;
	
	@Bean
	public CommandLineRunner TestProductMapperCommand() {
		return args -> {
			
			List<Product> products = productRepo.findAll();
			System.out.println("PRODUCTS");
			products.forEach(System.out::println);
			
			System.out.println("GET PRODUCTS");
			
			List<GetProduct> getProductList = productMapper.toGetProductList(products);
			getProductList.forEach(System.out::println);
			
			System.out.println("MAPPED PRODUCTS");
			
			List<Product> mapperProducts = productMapper.toProductList(getProductList);
			mapperProducts.forEach(System.out::println);
			
			
		};
	}
}
