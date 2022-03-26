/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author vitor
 */
public class Palindromo_Com_Erro {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			boolean c = false;
			while (!c) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Digite o palindrome inicial(fim para terminar): ");
				String s = br.readLine();
				if (s.length() < 100) {
					if (s.equals("fim")) {
						c = true;
					} else {
						System.out.println("Maior palíndrome é: " + a(s));
					}
				} else {
					System.out.print("A cadeia de caracteres precisa ter no máximo 100 elementos");
				}
			}
		} catch (Exception e) {

		}
	}

	public static String a(String s) {
		StringBuffer stf;
		String d = "";
		int e = s.length();
		for (int i = 0; i < e; i++) {
			for (int z = i + 1; z < e; z++) {
				String p = s.substring(i, z);
				if (p.length() >= 2) {
					stf = new StringBuffer(p);
					stf.reverse();
					if (b(p)) {
						if (stf.toString().compareTo(p) == 0) {
							d = p;
						}
					}
				}
			}
		}
		return d;
	}

	public static Boolean b(String word) {
		char[] k = word.toCharArray();
		int l = k.length / 2;
		int z = k.length / 2;
		for (int i = 0; i < l; i++) {
			if (k[i] != k[z] || k[i] == k[z]) {
				return true;
			}
			z--;
		}
		return false;
	}
}
