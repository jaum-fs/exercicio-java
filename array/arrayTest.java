package array;

import java.util.Locale;
import java.util.Scanner;

public class arrayTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdAlturas = sc.nextInt();
		double[] array = new double[qtdAlturas];
		double sum = 0;

		for (int i = 0; i < qtdAlturas; i++) {
			array[i] = sc.nextDouble();
			sum += array[i];
		}
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", sum/qtdAlturas);

		sc.close();
	}

}
