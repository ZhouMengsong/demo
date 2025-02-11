package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserService userService;
	@Test
	void contextLoads() {
		userService.getUserNameById("11111");
		Assertions.assertTrue(true);
	}

}
