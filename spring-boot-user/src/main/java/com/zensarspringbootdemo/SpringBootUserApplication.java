package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUserApplication.class, args);
		System.out.println("Request successfully processed");
	}
	public ModelMapper modelMapper(){
        return new ModelMapper();
}
}
