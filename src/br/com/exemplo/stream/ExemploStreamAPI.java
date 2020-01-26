package br.com.exemplo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

	public static void main(String[] args) {

		List<String> estudantes = new ArrayList<>();

		// Adicionar os estudantes
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Rafael");

		// Retorna a quuantidade de estudantes
		System.out.println("Contagem: " + estudantes.stream().count());

		// Retorna o elemento com maior numero de letras
		System.out.println(
				"Maior numeros de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

		// Retorna o elemento com menor numero de letras
		System.out
				.println("Menor numeros de letras:" + estudantes.stream().min(Comparator.comparingInt(String::length)));

		// Retorna os elementos que tem a letra R no nome
		System.out.println("Com a letra r do nome: " + estudantes.stream()
				.filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

		// Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de
		// cada nome
		System.out.println("Retorna o nome coleção com a quantidade de letras:" + estudantes.stream()
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.collect(Collectors.toList()));

		// Retorna somente os 3 primeiros elementos da coleção
		System.out.println(
				"Rotorna os 3 primeiros elementos:" + estudantes.stream().limit(3).collect(Collectors.toList()));

		// Exibe cada elemento no console sem retornar outra coleção
		System.out.println("Retorna os elementos novamente: ");
		estudantes.stream().forEach(System.out::println);

		// Retorna true se todas os elementos possuem a letra W no nome
		System.out.println("Tem algum elemento com W do nome? "
				+ estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

		// Retorna true algum os elementos possuem a letra minúscula do nome
		System.out.println("Tem algum elemento com a maiúscula no nome? "
				+ estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

		// Retorna o primeiro elemento da coleção, se existir exibe no console
		System.out.println("Retorna o primeiro elemento da coleção: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);

		// Exemplo de operação encadeada
		System.out.println("Operação encadeada: ");
		System.out.println(estudantes.stream().peek(System.out::println)
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r"))
				.collect(Collectors.groupingBy(estudante->estudante.substring(estudante.indexOf(" - ") + 1))));
	}

}
