package lista;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("Digite o numero de cartelas");
		int num = scan.nextInt();
		
		int[][] cartelas = new int[num][6];
		int[] resposta = new int[6];
		int[] aux = new int[6];
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 6; j++) {
				cartelas[i][j] = ((gerador.nextInt(60))+1);
			}
		}
		
		
		for (int i = 0; i < 6; i++) {
			resposta[i] = ((gerador.nextInt(60))+1);
		}
		
		Arrays.sort(resposta);
		
		for (int i = 1; i < resposta.length; i++) {
			if (resposta[i]==resposta[i-1]) {
				resposta[i] = ((gerador.nextInt(60))+1);
			}
		}
		
		Arrays.sort(resposta);
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < aux.length; j++) {
				aux[j] = 0;
			}
			
			System.out.println("Cartela "+(i+1));
			
			for (int j = 0; j < aux.length; j++) {
				aux[j] = cartelas[i][j];
			}
			
			Arrays.sort(aux);
			
			for (int j = 1; j < aux.length; j++) {
				if (aux[j]==aux[j-1]) {
					aux[j] = ((gerador.nextInt(60))+1);
				}
			}
			
			Arrays.sort(aux);
			
			
			for (int j = 0; j < aux.length; j++) {
				System.out.print(" |"+aux[j]);
			}

			System.out.println("");
			
			for (int j = 0; j < 6; j++) {
				if (aux[j] == resposta[j]) {
					System.out.println("Resposta correta");
				}else {
					System.out.println("Resposta incorreta");
				}
			}
		}
		
		System.out.println("----RESPOSTA----");
		for (int i = 0; i < resposta.length; i++) {
			System.out.print(" |"+resposta[i]);
		}
		
		scan.close();

	}

}
