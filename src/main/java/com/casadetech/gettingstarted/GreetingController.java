package com.casadetech.gettingstarted;

import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class GreetingController {
	
	@Autowired
	GreetingDAO greetingdao;
	
	@PostMapping("/greeting")
	public Greeting createGreeting(@Valid @RequestBody Greeting greeting) {
		return greetingdao.save(greeting);
	}
}
