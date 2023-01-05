package com.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Vaga;

@Repository
public interface EstacionamentoRepository extends JpaRepository<Vaga, UUID> {
	
	boolean existePlaca(String placaCarro);
	
}
