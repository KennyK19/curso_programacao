import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a quantidade que deseja informar:");
		int N = teclado.nextInt();
		String [] nome = new String [N];
		int [] idade = new int [N];
		double [] altura = new double [N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite o nome:");			
			nome[i] = teclado.next();
			System.out.println("Digite a idade:");
			idade[i] = teclado.nextInt();
			System.out.println("Digite a altura:");
			altura[i] = teclado.nextDouble();
		}
		
	    double somamedia = 0.0;
	    for (int i = 0; i < N; i++) {
	    	somamedia += altura[i];	    	
	    }
	    double media = somamedia / N;
	    System.out.printf("Altura média: %.2f\n", media);
	    
	    int cont = 0;
	    for (int i = 0; i < N; i++)
	    	if (idade[i] < 16) {
	    		cont += 1;
	    	}
	    double pessoas = (cont * 100.0) / N;
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%",pessoas);
	    
	
		teclado.close();
	}
}