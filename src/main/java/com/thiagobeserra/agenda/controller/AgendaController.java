package com.thiagobeserra.agenda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAgendas() {
		
		return ResponseEntity.status(HttpStatus.OK).body("Lista de agendas..");
		
	}
	
}
