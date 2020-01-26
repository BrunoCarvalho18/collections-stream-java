package br.com.exemplo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		//Hashset não tem uma ordem em especial
		Set<Double> notasAlunos = new HashSet<>();
		
		//Adiciona as notas no set
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);
		
		//Remove a nota no set
		notasAlunos.remove(3.8);
		
		notasAlunos.remove(7.3);
		
		System.out.println(notasAlunos);
		
		//Retorna a quantidade  de itens do set
		System.out.println("Quantidade de notas: "+notasAlunos.size());
		
		Iterator<Double> iterator = notasAlunos.iterator();
		
		while(iterator.hasNext()){
			System.out.println("Iterando as notas: "+iterator.next());
		}
		
		//Lambda é vida exemplo de for each lambda
		notasAlunos.forEach(nota->System.out.println("Mostrar todas as notas: " + nota));
		
		//Limpar notas  Alunos
		notasAlunos.clear();
		
		System.out.println("Validar se é true ou false: " + notasAlunos.isEmpty());
		
	}
}
