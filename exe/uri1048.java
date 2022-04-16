package exe;

import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double nsalario = 0d;
		double perCent = 0;
		String simbol = "%";
		
		if (salario <= 400) {
			perCent = 15;
			nsalario = salario + salario*perCent/100;
		}else if (salario > 400 && salario<=800) {
			perCent = 12;
			nsalario = salario + salario*perCent/100;
		}else if (salario > 800 && salario <= 1200) {
			perCent = 10;
			nsalario = salario + salario*perCent/100;
		}else if(salario > 1200 && salario <= 2000) {
			perCent = 07;
			nsalario = salario + salario*perCent/100;
		}else {
			perCent = 04;
			nsalario = salario + salario*perCent/100;
		}
		System.out.printf("Novo salario: %.2f%n", nsalario);
		System.out.printf("Reajuste ganho: %.2f%n", salario*perCent/100);
		System.out.printf("Em percentual: %.0f %s%n",perCent, simbol);
		
		sc.close();

	}

}
