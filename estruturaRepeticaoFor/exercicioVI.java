package estruturaRepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioVI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdX = sc.nextInt();
		int n1,n2;
		
		for (int i = 0; i < qtdX; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("divisão impossível");
			} else {
				double div = (double) n1/n2;
				System.out.printf("%.1f%n", div);
			}
		}
		
		
		
		sc.close();

	}

}
