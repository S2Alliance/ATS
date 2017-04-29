package com.freealliance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.freealliance.util.StatusCheckConnectionPool;


@SpringBootApplication
@ImportResource("META-INF/application-context.xml")
public class AtsApplication implements CommandLineRunner{

	@Autowired
	private StatusCheckConnectionPool statusCheckConnectionPool;
	
	@Override
	public void run(String... args) {
		this.statusCheckConnectionPool.printMessages();
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AtsApplication.class, args);
		
		
	}
}
