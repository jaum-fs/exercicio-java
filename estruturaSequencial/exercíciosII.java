package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercíciosII {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double raio, area, pi;
		Scanner sc = new Scanner(System.in);

		pi = 3.14159;
		raio = sc.nextDouble();
		area = (double) pi * Math.pow(raio, 2);

		System.out.printf("A=%.4f", area);
		System.out.println();

		sc.close();

	}

}
