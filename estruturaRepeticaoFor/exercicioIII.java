package estruturaRepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioIII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		double n1, n2, n3;
		
		for(int i = 0; i < x; i++) {
			n1 = sc.nextDouble()*2;
			n2 = sc.nextDouble()*3;
			n3 = sc.nextDouble()*5;
			double media = (n1 + n2 + n3)/10;
			
			System.out.printf("%.1f%n", media);
		}
		
		
		sc.close();

	}

}
