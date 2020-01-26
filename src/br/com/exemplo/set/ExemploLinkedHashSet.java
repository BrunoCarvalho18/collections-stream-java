package br.com.exemplo.set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		//LinkedHashSet tem uma ordem menos perform�tico
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

		// Adiciona os numeros no set
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(26);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);

		System.out.println("primeira sequencia num�rica: " + sequenciaNumerica);

		// Remove a posicao 4
		sequenciaNumerica.remove(4);

		System.out.println("segunda sequencia num�rica: " + sequenciaNumerica);

		// Retorna a quantidade de itens do set
		System.out.println("retornar a sequencia num�rica: " + sequenciaNumerica.size());

		// Retorna todos os n�meros
		sequenciaNumerica.forEach(numeros -> System.out.println("retorna todos os n�meros: " + numeros));

		sequenciaNumerica.clear();

		System.out.println("retorna se os n�meros est�o vazios: " + sequenciaNumerica.isEmpty());

	}

}
