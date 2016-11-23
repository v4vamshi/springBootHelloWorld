package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author vgunturu
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldTests {

	@Test
	public void contextLoads() {
	}

	String message = "Hello World";
	Result result = JUnitCore.runClasses(HelloWorld.class);

	public void testHelloWorld() {
		assertEquals(message, result);
	}
}
