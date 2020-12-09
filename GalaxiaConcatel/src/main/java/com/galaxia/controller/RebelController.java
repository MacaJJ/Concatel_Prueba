package com.galaxia.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxia.exception.ExceptionGalaxia;
import com.galaxia.model.Rebel;

@RestController
@RequestMapping(value = "register")
public class RebelController {
	
	@PostMapping(path = "/addRebel", consumes = "application/json", produces = "application/json")
	public String addRegister(@RequestBody Rebel rebel) throws ExceptionGalaxia {
		
		if(rebel.getName().equals("") || rebel.getPlanet().equals("")) {
			throw new ExceptionGalaxia();
		}
		
		Date date = new Date();
		SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String dateStr = dateF.format(date);		
		
		rebel.setFechahora(dateStr);
		
		return rebel.toString();
	}
}
