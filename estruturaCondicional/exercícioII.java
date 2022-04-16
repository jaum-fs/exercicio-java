package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercícioII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x%2 != 0) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}

		sc.close();
	}

}
