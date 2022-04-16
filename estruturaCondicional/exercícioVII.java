package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercícioVII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		int aux, excd;
		double total;
		
		if (minutos > 100) {
			aux = minutos / 100;
			minutos -= aux * 100;
			excd = (minutos % 100) * 2;
			total = (double) aux * 50 + excd;
			System.out.printf("Valor a pagar: %.2f%n", total);
		}
		else {
			System.out.printf("Valor a pagar: R$ 50.00 ");
		}
		
		
		sc.close();

	}

}
