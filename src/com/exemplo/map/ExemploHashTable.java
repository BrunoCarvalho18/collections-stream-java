package com.exemplo.map;

import java.util.Hashtable;

public class ExemploHashTable {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> estudantes = new Hashtable<>();
		
		estudantes.put("Carlos", 23);
		estudantes.put("Mariana",33);
		estudantes.put("Rafaela",18);
		estudantes.put("Pedro", 44);
		
		System.out.println(estudantes);
		
		estudantes.put("Pedro", 55);
		
		System.out.println(estudantes);
		//Remove um estudante no indice 0
		estudantes.remove("Pedro");
	}

}
