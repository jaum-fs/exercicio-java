package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exerc�cioIII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diff;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		diff = a*b - c*d;
		
		System.out.println("DIFREN�A = "+ diff);
		
		sc.close();
	}

}
