package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.shoppingApp.StartUI;

@SpringBootApplication
public class HelloWorld {

	public static void main(String[] args) {
		
		SpringApplication.run(HelloWorld.class, args);
	
		new StartUI();
	}

}
