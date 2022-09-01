package lista;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz (número impar entre 3 e 11): ");
		int num = 0;
		do {
			num = scan.nextInt();
		} while (num%2==0 || num>11 ||num<3);
		
		
		int[][] matriz = new int[num][num];
		int input = 0;
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int diagonalp = 0;
		int diagonals = 0;
		int aux = num-1;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("Digite o número da posição "+i+" "+j);
				input = scan.nextInt();
				
				matriz[i][j] = input;
				soma += matriz[i][j];
				
				if (i == 0 && j == 0) {
					menor = matriz[i][j];
					maior = matriz[i][j];
				}else{
					if (matriz[i][j]<menor) {
						menor = matriz[i][j];
					}else if (matriz[i][j]>maior) {
						maior = matriz[i][j];
					}
				}
				
				if (i == j) {
					diagonalp += matriz[i][j];
				}
				
				if (aux == j) {
					diagonals += matriz[i][j];
					aux--;
				}
			}
		}
		
		System.out.println("O menor dos elementos é :"+menor);
		System.out.println("O maior dos elementos é :"+maior);
		System.out.println("Soma dos elementos = "+soma);
		
		float media = (float)soma/(num*num);
		System.out.println("Média dos elementos = "+media);
		
		System.out.println("Soma da diagonal principal = "+diagonalp);
		System.out.println("Soma da diagonal secundaria = "+diagonals);
		
		for (int i = 0; i < num; i++) {
			System.out.println();
			for (int j = 0; j < num; j++) {
				System.out.print(matriz[i][j]+" | ");
			}	
		}
		
		scan.close();

	}
}
