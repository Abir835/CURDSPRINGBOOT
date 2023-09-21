package com.example.demoProject;

import com.example.demoProject.model.Content;
import com.example.demoProject.model.Status;
import com.example.demoProject.model.Type;
import com.example.demoProject.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

//	@Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository){
//		return args -> {
//			Content content = new Content(null,
//					"My frost blog post",
//					"My first blog",
//					Status.IDEA,
//					Type.ARTICLE,
//					LocalDateTime.now(),
//					null,
//					"");
//			repository.save(content);
//		};
//
//	}
	

}
