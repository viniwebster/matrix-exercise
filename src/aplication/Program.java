package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo numeros inteiros, podendo haver
		 * repetiçoes. Em seguida, ler um numero inteiro X que pertence a matriz. Para
		 * cada ocorrencia de X, mostrar os valores a esquerda, acima, a direita e
		 * abaixo de X, quando houver.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Digite o numero que deseja encontrar: ");
		int number = sc.nextInt();
		int x, y;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == number) {
					x = i;
					y = j;

					System.out.println("Position: " + x + "," + y);

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();
	}

}
