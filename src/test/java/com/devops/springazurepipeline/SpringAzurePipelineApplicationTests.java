package com.devops.springazurepipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.devops.spring.azure.pipeline.SpringAzurePipelineApplication;

@SpringBootTest
@ContextConfiguration(classes = SpringAzurePipelineApplication.class)
class SpringAzurePipelineApplicationTests {

	@Test
	void contextLoads() {
	}

}
