package exe;

import java.util.Locale;
import java.util.Scanner;

public class uri1157 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for( int i = 1; i<=num; i++ ) {
			if (num%i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		

	}

}
