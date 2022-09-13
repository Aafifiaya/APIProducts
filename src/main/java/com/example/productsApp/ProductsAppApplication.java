package com.example.productsApp;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.productsApp.Services.ProductService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProductsAppApplication {
	public static void main(String[] args) {
		new File(ProductService.uploadDirectory).mkdir();
		SpringApplication.run(ProductsAppApplication.class, args);
	}


}
