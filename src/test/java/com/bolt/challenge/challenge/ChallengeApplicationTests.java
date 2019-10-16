package com.bolt.challenge.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bolt.challenge.rules.ChallengeRules;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengeApplicationTests {
	
	@Autowired
	private ChallengeRules rules;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testChallengeRules() {
		assertEquals(new Long(1), rules.operationsNeeded("{{{}"));
		assertEquals(new Long(2), rules.operationsNeeded("}{"));
		assertEquals(new Long(0), rules.operationsNeeded("{{}}"));
	}

}
