package estruturaRepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioV {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int aux = 1;
		
		for (int i = 1; i <= x; i++) {
			aux *= i;
		}
		System.out.println(aux);
		
		
		sc.close();
	}

}
