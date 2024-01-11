package ex002_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hr;
		double vh, sal;
		
		
		num = sc.nextInt();
		hr = sc.nextInt();
		vh = sc.nextDouble();
		
		sal = vh * hr;
		
		System.out.println("Numero = " + num);
		
		System.out.printf("Salary U$ %.2f%n", sal);
		
		sc.close();
		
		

	}

}
