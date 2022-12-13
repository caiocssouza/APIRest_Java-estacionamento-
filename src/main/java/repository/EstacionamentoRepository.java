package repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Vaga;

@Repository
public interface EstacionamentoRepository extends JpaRepository<Vaga, UUID> {

}
