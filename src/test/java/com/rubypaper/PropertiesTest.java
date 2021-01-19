package com.rubypaper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "your.name=kkkkk", "your.age=11" })
public class PropertiesTest {

	@Autowired
	Environment environment;

	@Test
	public void testMethod() {
		System.out.println("name : " + environment.getProperty("your.name"));
		System.out.println("age : " + environment.getProperty("your.age"));
	}
}
