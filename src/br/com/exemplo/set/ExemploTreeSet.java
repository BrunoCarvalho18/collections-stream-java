package br.com.exemplo.set;

import java.util.TreeSet;

//Arvore Binária
public class ExemploTreeSet {

	public static void main(String[] args) {
		//O TreeSet pega os valores desordenados, muito performático
		TreeSet<String> capitais = new TreeSet<>();
		
		capitais.add("Porto Alegre");
		capitais.add("Florianopolis");
		capitais.add("Curitiba");
		capitais.add("Sao Paulo");
		capitais.add("Rio de Janeiro");
		capitais.add("Belo Horizonte");
		
		System.out.println("exibe todos os capitais: "+ capitais);
		
		//Retorna a primeira capital do topo da árvore
		System.out.println("exibe todos os capitais: "+ capitais.first());
		
		//Retorna a última capital do final da árvore
		System.out.println(capitais.last());
		
		//Retorna a primeira capital abaixo da árvore
		System.out.println(capitais.lower("Florianopolis"));
		
		//Exibe todas as capitais no console
		System.out.println(capitais);
	}

}
