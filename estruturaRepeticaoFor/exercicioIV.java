package estruturaRepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioIV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++ ) {
			System.out.printf("%d %d %.0f%n", i, i*i, Math.pow(i, 3));
		}
		
		sc.close();

	}

}
