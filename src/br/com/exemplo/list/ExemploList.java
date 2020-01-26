package br.com.exemplo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		//Lista com os nomes
		List<String> nomes = new ArrayList<>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("Jo�o");
		
		//Ordenar nomes pelo for each
		nomes.forEach(s->System.out.println(s));
		
		//Adicionar o nome Larissa
		nomes.set(2, "Larissa");
		System.out.println("adicionar o nome Larissa: "+ nomes);
		
		//Ordenar por ordem alfab�tica
		Collections.sort(nomes);
		System.out.println("ordenar os nomes por ordem alfab�tica: "+ nomes);
		
		//Remover o nome Wesley
		nomes.remove("Wesley");
		System.out.println(nomes);
		
		//Pegar a terceira posi��o
		String nome = nomes.get(3);
		System.out.println("qual o nome da posi��o 3: " +nome);
		
		//Verificar o tamanho
		int tamanho = nomes.size();
		System.out.println("qual � o tamanho das posi��es: "+ tamanho);
		
		boolean temAnderson = nomes.contains("Anderson");
		System.out.println("a reposta pode ser true ou false: "+temAnderson);
		
	}

}
