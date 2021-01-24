package br.com.zup.api.util;

import java.util.Random;

public class JogoUtil {

	public static String gerar(int tamanho) {
		String numero = "";
		Random gerador = new Random();

		for (int i = 0; i < tamanho; i++) {
			numero += gerador.nextInt(99) + "-";
		}
		
		return numero.substring(0, numero.length() - 1);
	}

}
