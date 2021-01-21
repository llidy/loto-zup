package br.com.zup.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.api.model.Aposta;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, Long> {

}
