package br.com.zup.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.api.model.Aposta;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, Long> {
	
	Page<Aposta> findByEmailOrderByData(String email, Pageable pageable);

}
