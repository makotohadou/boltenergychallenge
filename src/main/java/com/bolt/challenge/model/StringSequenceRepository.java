package com.bolt.challenge.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringSequenceRepository extends CrudRepository<StringSequence,String>{

}
