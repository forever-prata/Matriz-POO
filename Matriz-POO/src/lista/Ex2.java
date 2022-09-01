package lista;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[5][5];
		float[] soma = new float[5];
		float[] totalp = new float[5];
		float barato = 0;
		float caro = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Digite o preço do produto "+(i+1)+" no mercado "+(j+1));
				matriz[i][j] = scan.nextInt();
				totalp[i]+= matriz[i][j];
			}
		}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("-------------------------");
			System.out.println("Preços no mercado "+(i+1));
			for (int j = 0; j < 5; j++) {
				System.out.println(matriz[j][i]);
				soma[i] += matriz[j][i];
			}
			System.out.println("Soma de preços no mercado "+(i+1)+" : "+soma[i]);
		}
		System.out.println("---------------------------");
		for (int i = 0; i < totalp.length; i++) {
			System.out.println("Média de preço do produto "+(i+1)+" = "+totalp[i]/5);
		}
		scan.close();
		
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				barato = soma[i];
				caro = soma[i];
			}else {
				if (soma[i]<barato) {
					barato = soma[i];
				}else if (soma[i]>caro) {
					caro = soma[i];
				}
			}
		}
		
		System.out.println("Preço total no mercado mais barato = "+barato);
		System.out.println("Preço total no mercado mais caro = "+caro);

	}

}
