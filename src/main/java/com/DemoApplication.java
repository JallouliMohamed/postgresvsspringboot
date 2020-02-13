package com;

import com.controller.FactTimeLineController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoApplication  {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private FactTimeLineController ff;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
