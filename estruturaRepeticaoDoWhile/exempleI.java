package estruturaRepeticaoDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class exempleI {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tempF, tempC;
		char option;
		
		do{
			System.out.print("Digite a temperatura em Celsius:");
			tempC= sc.nextDouble();
			tempF = (9*tempC)/5+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempF);
			System.out.print("Deseja repetir? (s/n)");
			option = sc.next().charAt(0);
		}while(option == 's');
		
		sc.close();

	}

}
