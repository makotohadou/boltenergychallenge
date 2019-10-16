package com.bolt.challenge.rules;

import org.springframework.stereotype.Service;

@Service
public class ChallengeRules {
	
	
	public Long operationsNeeded(String input) {
		String clean = removeStable(input);
		if (clean.length() == 0){
			return Long.valueOf(0);
		}
		if (clean.charAt(0)== '{') {
			return Long.valueOf(clean.length() / 2);
		} else {
			return Long.valueOf((clean.length() / 2 ) + 1);
		}
	}
	private String removeStable(String input) {
		String[] stringArray = input.split("\\{\\}");
		if (stringArray.length > 1){
			return removeStable(join(stringArray));
			
		} else {
			return join(stringArray);
		}
		
	}
	
	private String join(String[] stringArray) {
		return String.join("", stringArray);
	}

}
