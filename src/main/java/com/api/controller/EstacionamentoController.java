package com.api.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.EstacionamentoDTO.EstacionamentoDTO;
import com.api.model.Vaga;
import com.api.service.EstacionamentoService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*" , maxAge = 3600)
@RequestMapping("/estacionamento")

public class EstacionamentoController {
	final EstacionamentoService estacionamentoService;
	public EstacionamentoController(EstacionamentoService estacionamentoService) {
		this.estacionamentoService = estacionamentoService;
	}
	
	//requestbody recebe e envia dados em formato json / valid valida as validações da calsse dto
	@PostMapping
	public ResponseEntity<Object> saveEstacionamento(@RequestBody @Valid EstacionamentoDTO estacionamentoDTO){
	
		Vaga vaga = new Vaga();//converte dto em objeto de Vaga
		BeanUtils.copyProperties(estacionamentoDTO, vaga);//converte o dto em um objeto de Vaga
		vaga.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));//setando a data que não foi instanciada no dto
		return ResponseEntity.status(HttpStatus.CREATED).body(estacionamentoService.save(vaga));
		
	}
	
}