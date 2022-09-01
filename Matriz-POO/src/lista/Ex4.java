package lista;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de atletas: ");
		int num = scan.nextInt();
		
		int[][] saltos = new int[num][5];
		float[] mediaAtleta = new float[num];
		float totalTemp = 0;
		float ultimo = 0;
		float campeao = 0;
		
		for (int i = 0; i < num; i++) {
			totalTemp = 0;
			for (int j = 0; j < 5; j++) {
				System.out.println("Digite o salto "+(j+1)+" do atleta "+(i+1));
				saltos[i][j] = scan.nextInt();
				
				totalTemp += saltos [i][j];
			}
			mediaAtleta[i] = totalTemp/5;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println("Atleta "+(i+1));
			for (int j = 0; j < 5; j++) {
				System.out.print(saltos[i][j]+" |");
			}
			System.out.println("");
			System.out.println("Media do atleta = "+mediaAtleta[i]);
			System.out.println("-------------------------------------");
		}
		
		for (int i = 0; i < mediaAtleta.length; i++) {
			if (i==0) {
				ultimo = mediaAtleta[i];
				campeao = mediaAtleta[i];
			}else {
				if (mediaAtleta[i]<ultimo) {
					ultimo = mediaAtleta[i];
				}else if (mediaAtleta[i]>campeao) {
					campeao = mediaAtleta[i];
				}
			}
		}
		
		System.out.println("Media do ultimo = "+ultimo);
		System.out.println("Media do campeao = "+campeao);
		
		scan.close();

	}

}
