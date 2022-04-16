package exe;
import java.util.Locale;
import java.util.Scanner;

public class uri1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int notasValidas = 0;
		double somaValidas = 0d;
		
		while (notasValidas!=2) {
			double nota = sc.nextDouble();
			if (nota >=0 && nota<=10){
				somaValidas += nota;
				notasValidas+=1;
			}else {
				System.out.println("Nota inválida");
			}
		}
		double result = media(somaValidas);
		System.out.printf("MEDIA = %.2f", result);
		
		
		
		
		sc.close();
	}
	
	public static double media(double s) {
		
		double result = s/2;
		
		return result;
	}

}
