package estruturaRepeticaoWhile;

import java.util.Locale;
import java.util.Scanner;

public class exercicioII {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else{
				System.out.println("segundo");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		System.out.println("");
		
		
		
		
		sc.close();
	}

}
