package ex002_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qt1, qt2, cod1, cod2;
		double price1, price2, total;
		
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		price1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		total = price1 * qt1 + price2 * qt2;
		
		System.out.printf("Valor a pagar R$: %.2f%n ", total);
		
		sc.close();

	}

}
