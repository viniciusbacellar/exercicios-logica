package application;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.print("1 ");
		int dp[] = new int[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = 1 + dp[i - dp[dp[i - 1]]];
			System.out.print(dp[i] + " ");
		}
		
		sc.close();
	}
}