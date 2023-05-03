package com.alihmzyv;

import com.alihmzyv.config.KafkaTopicConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaSpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringBootExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate, KafkaTopicConfig kafkaTopicConfig) {
		return args -> kafkaTemplate.send(kafkaTopicConfig.getTopicName(), "first message");
	}
}
