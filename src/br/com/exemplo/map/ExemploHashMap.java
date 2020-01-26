package br.com.exemplo.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {

		// Adiciona os campeões mundiais da fifa no mapa
		Map<String, Integer> campeaoMundialFifa = new HashMap<>();

		campeaoMundialFifa.put("Brasil", 5);
		campeaoMundialFifa.put("Alemanha", 4);
		campeaoMundialFifa.put("Italia", 4);
		campeaoMundialFifa.put("Uruguai", 2);
		campeaoMundialFifa.put("Franca", 2);

		// Atualiza o valor da chave para o Brasil
		campeaoMundialFifa.put("Brasil", 6);

		// Retorna todos os campeoes mundiais
		System.out.println(campeaoMundialFifa);

		// Retorna a chave 4
		System.out.println(campeaoMundialFifa.get("Alemanha"));

		// Retorna se existe ou não um campeão França
		System.out.println(campeaoMundialFifa.containsKey("Franca"));

		// Retorna se tem ou não uma seleção campeã
		System.out.println(campeaoMundialFifa.containsValue(6));

		// Retorna o tamanho do mapa
		System.out.println(campeaoMundialFifa.size());

		System.out.println(campeaoMundialFifa);

		// Remove campeao mundial
		campeaoMundialFifa.remove("Franca");

		System.out.println(campeaoMundialFifa.size());

		System.out.println(campeaoMundialFifa);

		// Navega os registros do maps

		// Navega nos registros do mapa
		for (Map.Entry<String, Integer> entry : campeaoMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue() + "\n");
		}

		// Navega nos registros do mapa for each
		for (String chave : campeaoMundialFifa.keySet()) {
			System.out.println(chave + "---" + campeaoMundialFifa.get(chave));
		}
		
		System.out.println(campeaoMundialFifa);

	}

}
