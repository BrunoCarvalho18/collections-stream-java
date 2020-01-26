package br.com.exemplo.set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		//LinkedHashSet tem uma ordem menos performático
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

		// Adiciona os numeros no set
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(26);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);

		System.out.println("primeira sequencia numérica: " + sequenciaNumerica);

		// Remove a posicao 4
		sequenciaNumerica.remove(4);

		System.out.println("segunda sequencia numérica: " + sequenciaNumerica);

		// Retorna a quantidade de itens do set
		System.out.println("retornar a sequencia numérica: " + sequenciaNumerica.size());

		// Retorna todos os números
		sequenciaNumerica.forEach(numeros -> System.out.println("retorna todos os números: " + numeros));

		sequenciaNumerica.clear();

		System.out.println("retorna se os números estão vazios: " + sequenciaNumerica.isEmpty());

	}

}
