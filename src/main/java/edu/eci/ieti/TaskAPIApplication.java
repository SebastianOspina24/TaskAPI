package edu.eci.ieti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "edu.eci.ieti" })
@SpringBootApplication
public class TaskAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskAPIApplication.class, args);
	}

}
