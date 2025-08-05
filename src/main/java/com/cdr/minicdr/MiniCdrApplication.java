package com.cdr.minicdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com.cdr.minicdr")
@EnableAspectJAutoProxy
public class MiniCdrApplication {
	public static void main(String[] args) {
		SpringApplication.run(MiniCdrApplication.class, args);
	}
}
