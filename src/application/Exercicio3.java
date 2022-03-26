package application;

import java.util.Scanner;

import entities.Lanchonete;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdTipoCarne = 0;
		int qtdSalada = 0;
		int qtdMaionese = 0;
		int qtdBf = 0;
		int qtdRefri = 0;
		
		System.out.print("hamburger (carne ou frango): ");
		String hb = sc.next();
		System.out.print("Quantos: ");
		qtdTipoCarne = sc.nextInt();
		System.out.print("Salada (sim / não): ");
		String salada = sc.next();
		if (salada.equals("sim")) {
			qtdSalada += 1;
		}
		System.out.print("Maionese? (sim / não): ");
		String maioneseHb = sc.next();
		if (maioneseHb.equals("sim")) {
			qtdMaionese += 1;
		}
		System.out.print("Batata Frita? (sim / não): ");
		String bf = sc.next();
		if (bf.equals("sim")) {
			System.out.print("Quantas? ");
			qtdBf += sc.nextInt();
			System.out.print("Maionese? (sim / não)");
			String maioneseBf = sc.next();
			if (maioneseBf.equals("sim")) {
				qtdMaionese += 1;
			}
		}
		System.out.print("Refrigerante? (sim / não): ");
		String refri = sc.next();
		if(refri.equals("sim")) {
			System.out.print("Quantos? ");
			qtdRefri += sc.nextInt();
		}
		Lanchonete lc = new Lanchonete(hb, qtdTipoCarne, qtdBf, qtdRefri, qtdSalada, qtdMaionese);
		
		// O valor do total do segundo exemplo é 57 mas nas instruções estava 58
		System.out.println(lc.total()); 
		
		sc.close();
	}
}
