package application;

import java.util.Scanner;

import services.PrintService;
import services.PrintServiceString;



public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		PrintServiceString pss = new PrintServiceString();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		try {
			
		System.out.println("Informe os n�meros inteiros para adicion�-los na lista: ");
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		System.out.println("Informe nomes de pessoas para adicion�-los na lista: ");
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String value = sc.nextLine();
			pss.addValue(value);
		}
		
		pss.print();
		System.out.println("First: " + pss.first());
		
		
		}catch(IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}
}
