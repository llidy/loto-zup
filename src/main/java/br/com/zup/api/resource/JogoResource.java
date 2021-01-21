package br.com.zup.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.api.service.JogoService;

@RestController
@RequestMapping(value = "/api/v1")
public class JogoResource {
	
	@Autowired private JogoService jogoService;
	
	@PostMapping("/jogos")
	public ResponseEntity<?> jogar(@RequestBody JogoRequest jogoRequest) {
		return ResponseEntity.status(HttpStatus.CREATED).body(jogoService.jogar(jogoRequest.getEmail()));
	}
	
	@GetMapping("/apostas")
	public ResponseEntity<?> buscarApostas(@RequestParam String email, Pageable pageable) {
		return ResponseEntity.ok(jogoService.listarPorEmail(email, pageable));
	}

}
