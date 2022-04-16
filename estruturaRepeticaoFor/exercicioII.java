package estruturaRepeticaoFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, range, outRange;
		
		x = sc.nextInt();
		range = 0;
		outRange=0;
		
		for ( int i = 0; i < x; i++) {
			int num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				range += 1;
			}else {
				outRange += 1;
			}
		}
		System.out.printf("%d in%n%d out%n", range, outRange);
		
		sc.close();

	}

}
