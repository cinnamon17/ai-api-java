package com.moncada.apis;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApisApplicationTests {

	@Autowired
	private OllamaChatClient client;

	@Test
	void testCall() {
		String response = client.call("Why is the sky blue");
		System.out.println(response);
		assertTrue(response.length() > 30);
	}

}
