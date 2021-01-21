package br.com.zup.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.zup.api.model.Aposta;
import br.com.zup.api.repository.ApostaRepository;
import br.com.zup.api.util.JogoUtil;

@Service
public class JogoService {
	
	private Aposta aposta;
	
	@Autowired
	private ApostaRepository apostaRepository;
	
	public String jogar(String email) {
		String jogo = JogoUtil.gerar(6);
		
		aposta = new Aposta();
		aposta.setEmail(email);
		aposta.setJogo(jogo);
		
		apostaRepository.save(aposta);
		
		return jogo;
	}
	
	public Page<Aposta> listarPorEmail(String email, Pageable pageable) {
		return apostaRepository.findByEmailOrderByData(email, pageable);
	}
	
}
