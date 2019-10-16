package com.bolt.challenge.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StringSequence {
	@Id
	private String sequence;
	private Long cost;
	
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

}
