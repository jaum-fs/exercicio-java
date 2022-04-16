package estruturaRepeticaoWhile;

import java.util.Locale;
import java.util.Scanner;

public class exercicioIII {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a,g,d;
		
		int num = sc.nextInt();
		a = 0;
		g = 0;
		d = 0;
		
		while (num!=4) {
			if (num==1) {
				a += 1;
				num = sc.nextInt();
			}else if (num==2) {
				g += 1;
				num = sc.nextInt();
			}else if (num==3) {
				d += 1;
				num = sc.nextInt();
			}else {
				num = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", a);
		System.out.printf("Gasolina: %d%n", g);
		System.out.printf("Diesel: %d%n", d);
		
		
		
		sc.close();

	}

}
