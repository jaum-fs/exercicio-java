package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercício {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		
		
		sc.close();
		
	}

}
