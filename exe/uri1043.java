package exe;

import java.util.Locale;
import java.util.Scanner;

public class uri1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (a + b > c && a + c > b && c + b > a) {
			double p = a+b+c;
			System.out.printf("Perimetro = %.1f%n", p);
		}else {
			double area = (a+b)/2 * c;
			System.out.printf("Area = %.1f%n", area);
		}
		
		
		
		
		sc.close();
	}

}
