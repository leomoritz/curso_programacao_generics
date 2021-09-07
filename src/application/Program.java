package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> psi = new PrintService<>();
		PrintService<String> pss = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		try {

			System.out.println("Informe nomes de pessoas para adicioná-los na lista: ");
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				String value = sc.nextLine();
				pss.addValue(value);
			}

			pss.print();
			System.out.println("First: " + pss.first());

			System.out.println("Informe os números inteiros para adicioná-los na lista: ");

			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				psi.addValue(value);
			}

			psi.print();
			System.out.println("First: " + psi.first());

		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}
}
