package application;

import java.util.Scanner;

public class Exercicio1 {
	private static final Double dolar = 5.36;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor(reais): ");
		double reais = sc.nextDouble();
		System.out.printf("%.2f%n", conversaoDolar(reais));
		
		sc.close();
	}
	
	// Função auxiliar
	public static double conversaoDolar(Double reais) {
		return reais * dolar;
	}

}
