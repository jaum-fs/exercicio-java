package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercícioV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double total;
		
		codigo = sc.nextInt();
		qtd= sc.nextInt();
		
		if (codigo == 1) {
			total = 4*qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if (codigo == 2) {
			total = 4.5*qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if (codigo == 3) {
			total = 5*qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if (codigo == 4) {
			total = 2*qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}else if (codigo == 5) {
			total = 1.5*qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
		
	}
	
}
