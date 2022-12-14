package com.example.Jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JacocoApplicationTests {

    @Test
	void contextLoads() {

	}

	@Test
	public void testMessageAmazeRec(){
		Message jc = new Message();
		Assertions.assertEquals("Hello AmazeRec!",jc.getMessage("AmazeRec"));
	}

	@Test
	public void testMessageBlank(){
		Message jc = new Message();
		Assertions.assertEquals("Please provide your name",jc.getMessage(""));
	}

	@Test
	public void testMessageNull(){
		Message jc = new Message();
		Assertions.assertEquals("Please provide your name",jc.getMessage(null));
	}

	@Test
	public void testSum(){
		Message jc = new Message();

		Assertions.assertEquals(9,jc.getSum(4,5));
	}
}
