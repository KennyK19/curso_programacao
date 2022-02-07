import java.util.Locale;
import java.util.Scanner;

public class MediaPessoasIdAlt {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		int N = teclado.nextInt();		
		String [] nome = new String [N];
		int [] idade = new int [N];
		double [] alt = new double [N];
		
		for (int i = 0; i < N; i++) {
			nome [i] = teclado.next();
			idade [i] = teclado.nextInt();
			alt [i] = teclado.nextDouble();			
		}
//		
//		for (int i = 0; i < N; i++) {
//			System.out.print(nome[i] + " ");
//			System.out.print(idade[i] + " ");
//			System.out.print(alt[i] + " ");
//			System.out.println();
//		}
//		
		double somalt = 0.0;
		
		for (int i = 0; i < N; i++) {
			somalt += alt[i];			
		}		
		double medialt = somalt / N;
		
		System.out.printf("Altura media: %.2f\n",medialt);
		
		int cont = 0;
		for (int i = 0; i<N;i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}		
		double mediaidade = (cont * 100.0) / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",mediaidade);		
		
		teclado.close();
	}

}
