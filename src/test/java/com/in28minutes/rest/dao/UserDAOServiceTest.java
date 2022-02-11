package com.in28minutes.rest.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.rest.RestWebServiceDemoApplication;
import com.in28minutes.rest.entity.User;

@SpringBootTest(classes= {RestWebServiceDemoApplication.class})
class UserDAOServiceTest {

	@Autowired
	UserDAOService userDAOService;
	
	@Test
	void testGetUsers() {
		List<User> allUsers = userDAOService.getUsers();
		assertFalse(allUsers.isEmpty());
		assertEquals(3, allUsers.size());
		assertEquals(2, allUsers.size());
	}

}
