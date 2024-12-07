package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EndSemLabExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndSemLabExamApplication.class, args);
		System.out.println("Hello.....!!!!");
	}

    @Bean
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
