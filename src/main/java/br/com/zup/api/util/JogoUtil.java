package br.com.zup.api.util;

import java.util.UUID;

public class JogoUtil {
	
	public static String gerar(int tamanho) {
		String codigo = String.valueOf(UUID.randomUUID().getMostSignificantBits());
		codigo = codigo.replace("-", "");
		codigo = codigo.substring(0, tamanho);
		
		return codigo;
	}

}
