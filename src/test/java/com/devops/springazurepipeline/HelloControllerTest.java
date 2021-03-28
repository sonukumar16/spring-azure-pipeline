package com.devops.springazurepipeline;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.devops.spring.azure.pipeline.controller.HelloController;


@SpringBootTest
@ContextConfiguration(classes = HelloController.class)
public class HelloControllerTest {
	@Autowired
	private HelloController controller;
	

	@Test
	public void getGreeting() throws Exception {
		System.out.println("test case is running");
		assertThat(controller).isNotNull();
	}
}
