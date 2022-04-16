package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercícioIV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int num, horas;
		double valorHora, total;
		
		num = input.nextInt();
		horas = input.nextInt();
		valorHora = input.nextDouble();
		
		total = (double) horas * valorHora;
		
		System.out.printf("NUMBER: %d %nSALARY: U$ %.2f", num, total);
		
		input.close();
	}

}
