package spring.data.jpa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class AppApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}