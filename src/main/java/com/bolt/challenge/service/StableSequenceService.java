package com.bolt.challenge.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolt.challenge.model.StringSequence;
import com.bolt.challenge.model.StringSequenceRepository;
import com.bolt.challenge.rules.ChallengeRules;

@Service
public class StableSequenceService {
	
	@Autowired
	private StringSequenceRepository repository;
	
	@Autowired
	private ChallengeRules rules;
	
	public Long getOperationsNeeded(String input) {
		Optional<StringSequence> exists = repository.findById(input);
		if (exists.isPresent()) {
			System.out.println("Found on db");
			return exists.get().getCost();
		} else {
			Long cost = rules.operationsNeeded(input);
			StringSequence obj = new StringSequence();
			obj.setCost(cost);
			obj.setSequence(input);
			repository.save(obj);
			System.out.println("Not found on db");
			return cost;
		}
	}

}
