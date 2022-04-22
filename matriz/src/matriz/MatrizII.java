package matriz;

import java.util.Locale;
import java.util.Scanner;

public class MatrizII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de linhas: ");
		int lin = sc.nextInt();
		System.out.print("Insira a quantidade de colunas: ");
		int col = sc.nextInt();
		
		int[][] matriz = preencheMatriz(lin, col);
		mostraMatriz(matriz);
		
		
		System.out.print("Qual número quer identificar? \n");
		int num = sc.nextInt();
		
		positions(num, matriz);
		
		sc.close();
		
	}
	
	public static int[][] preencheMatriz(int lin, int col){
		
		Scanner sc = new Scanner(System.in);
		
		int [][]mat = new int[lin][col];
		
		for( int i=0; i<mat.length; i++){
			for(int j=0; j<mat[i].length; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return mat;
	}
	
	public static void mostraMatriz(int[][] matriz){
		for(int i = 0; i<matriz.length; i++){
			for( int j = 0; j<matriz[i].length; j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void positions(int number, int mat[][]){
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position : " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}

	}
}
