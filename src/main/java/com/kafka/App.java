package com.kafka;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App extends SpringBootServletInitializer {
	public static void main(final String[] args)  {
		SpringApplication.run(App.class);
	}
}
//Reference
//https://github.com/mvallim/spring-camel-kafka-schema-registry
//https://stackoverflow.com/questions/27405713/running-code-after-spring-boot-starts