package in.vanna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
public class S3MicroservicesApiApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(S3MicroservicesApiApplication.class, args);
	}
}