package br.com.zup.api.resource;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class JogoRequest {
	
	@NotBlank(message = "O preenchimento é obrigatório")
	@Email(message = "E-mail inválido")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
