package com.exemplo.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> treeCapitais = new TreeMap<>();

		// Monta a árvore com as capitais
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SP", "Sao Paulo");
		treeCapitais.put("SC", "Florianopolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizonte");

		System.out.println(treeCapitais);

		// Retorna a primeira chave na arvore
		System.out.println("primeira chave: " + treeCapitais.firstKey());

		// Retorna a ultima chave na arvore
		System.out.println("ultima chave: " + treeCapitais.lastKey());

		// Retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));

		// Retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));

		System.out.println(treeCapitais.firstEntry().getKey() + " -- " + treeCapitais.firstEntry().getValue());

		System.out.println(treeCapitais.lastEntry().getKey() + " -- " + treeCapitais.lastEntry().getValue());

		// Exibe todas as capitais no console
		System.out.println(treeCapitais);

		// Navega todas as chaves do iterator
		Iterator<String> iterator = treeCapitais.keySet().iterator();

		while (iterator.hasNext()) {
			String chave = iterator.next();
			System.out.println(chave + " - " + treeCapitais.get(chave));
		}

		for (String capital : treeCapitais.keySet()) {
			System.out.println(capital + " - " + treeCapitais.get(capital));
		}

		for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
			System.out.println(capital.getKey() + " - " + capital.getValue());
		}
	}

}
