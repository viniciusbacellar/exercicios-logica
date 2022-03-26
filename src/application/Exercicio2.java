package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> contagem = new HashMap<Integer, Integer>();

		System.out.print("Digite um numero: ");
		String numeros = sc.next();
		String[] vect = numeros.split("");
		for (int i = 0; i < vect.length; i++) {
			contagem.compute(Integer.parseInt(vect[i]), (k, v) -> v == null ? 1 : v+1);
		}
		
		int maior = 0;
		int chave = 0;
		for(Integer key : contagem.keySet()) {
			Integer value = contagem.get(key);
			if(value > maior) {
				maior = value;
				chave = key;
			}
		}
		System.out.println(chave);
		
		sc.close();
	}
}