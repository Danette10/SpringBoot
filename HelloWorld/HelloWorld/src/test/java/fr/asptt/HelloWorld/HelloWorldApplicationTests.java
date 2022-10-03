package fr.asptt.HelloWorld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.asptt.HelloWorld.service.BusinessService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetHelloworld() {
		String expected = "Hello World!";

		String result = bs.getHelloworld().getValue();

		assertEquals(expected, result);
	}

}
