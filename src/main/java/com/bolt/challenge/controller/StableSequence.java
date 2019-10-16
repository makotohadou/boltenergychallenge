package com.bolt.challenge.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolt.challenge.rules.ChallengeRules;

@RestController
@RequestMapping("/bolt")
public class StableSequence {
	
	@Autowired
	private ChallengeRules rules;
	
	@PostMapping("/operations")
	public List<Long> getNumberOfOperations(@RequestBody List<String> inputs) {
		return inputs.stream().map(i -> rules.operationsNeeded(i)).collect(Collectors.toList());
		
	}

}
