package br.edu.imepac.folhapagamento.repositories;

import br.edu.imepac.folhapagamento.entities.Cordinator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CordinatorRepository extends JpaRepository<Cordinator, Long> {
}
