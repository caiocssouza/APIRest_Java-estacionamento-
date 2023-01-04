package com.api.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.model.Vaga;
import com.api.repository.EstacionamentoRepository;

@Service
public class EstacionamentoService {

	final EstacionamentoRepository estacionamentoRepository;
	
	public EstacionamentoService(EstacionamentoRepository estacionamentoRepository) {
		this.estacionamentoRepository = estacionamentoRepository;
	}
	@Transactional
	public Vaga save(Vaga vaga) {
		return estacionamentoRepository.save(vaga);
	}

}

