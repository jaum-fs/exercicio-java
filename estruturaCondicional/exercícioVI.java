package estruturaCondicional;

import java.util.Scanner;
import java.util.Locale;

public class exercícioVI {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x < 0 && y > 0) {
			System.out.println("Q4");
		} else{
			System.out.println("Origem");
		}
			

		sc.close();

	}

}
