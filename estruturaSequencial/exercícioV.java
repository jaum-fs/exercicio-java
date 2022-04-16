package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercícioV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double preco1, preco2, total;
		
		sc.nextInt();
		num1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		sc.nextInt();
		num2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = (double) num1*preco1 + num2*preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		sc.close();
		
	}

}
