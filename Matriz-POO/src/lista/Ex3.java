package lista;
import java.util.Scanner;

public class Ex3 {

	public static String format(float x) {
	    return String.format("%.2f", x);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos na turma: ");
		int num = scan.nextInt();
		
		float[][] notas = new float[num][2];
		String[] nomes = new String[num];
		float[] mediaAluno = new float[num];
		String nomeMenor = "";
		String nomeMaior = "";
		float menor = 11;
		float maior = -1;
		float totalTemp = 0;
		float total = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			totalTemp = 0;
			scan.nextLine();
			System.out.print("Digite o nome do aluno "+(i+1)+" : ");
			nomes[i]= scan.nextLine();
			
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite a nota "+(j+1)+" do aluno "+(i+1)+" : ");
				notas[i][j] = scan.nextFloat();
				totalTemp += notas [i][j];
				total+= notas[i][j];
			}
			
			mediaAluno[i] =  totalTemp/2;
		}
		
		for (int i = 0; i < mediaAluno.length; i++) {
			if (mediaAluno[i]<menor) {
				menor = mediaAluno[i];
				nomeMenor = nomes[i];
			}else if (mediaAluno[i]>maior) {
				nomeMaior = nomes[i];
				maior = mediaAluno[i];
			}
		}
		
		float media = (total/num)/2;
		String str = format(media);
		
		System.out.println("Maior media = "+maior+" Aluno : "+nomeMaior);
		System.out.println("Menor media = "+menor+" Aluno : "+nomeMenor);
		System.out.println("Media da turma = "+str);
		System.out.println("-------------------------------");
		
		System.out.println("Alunos Acima da media");
		for (int i = 0; i < num; i++) {
			if (mediaAluno[i]>= media) {
				System.out.println(nomes[i]+" Media = "+mediaAluno[i]);
			}
		}
		
		System.out.println("Alunos Abaixo da media");
		for (int i = 0; i < num; i++) {
			if (mediaAluno[i]< media) {
				System.out.println(nomes[i]+" Media = "+mediaAluno[i]);
			}
		}
		
		scan.close();

	}

}
