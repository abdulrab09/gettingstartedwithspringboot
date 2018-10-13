package com.casadetech.gettingstarted;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class GreetingDAO {
	@Autowired 
	private GreetingRepository greetingRepository;
	
	public Greeting save(Greeting greeting) {
		return greetingRepository.save(greeting);
	} 
	
	public List<Greeting> findAll(){
		return Lists.newArrayList(greetingRepository.findAll()); 
	}
	
	public Optional<Greeting> findOne(Long id) {
		return greetingRepository.findById(id);
	}
	
	public void delete(Greeting greeting) {
		greetingRepository.delete(greeting);
	}

}
