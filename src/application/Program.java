package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		try {

			System.out.println("Informe nomes de pessoas para adicioná-los na lista: ");
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				String value = sc.nextLine();
				ps.addValue(value);
			}

			ps.print();
			String nomes = (String) ps.first();
			System.out.println("First: " + nomes);

			System.out.println("Informe os números inteiros para adicioná-los na lista: ");

			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				ps.addValue(value);
			}

			ps.print();
			Integer numeros = (Integer) ps.first();
			System.out.println("First: " + numeros);

		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}
}
