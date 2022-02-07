import java.util.Locale;
import java.util.Scanner;

public class VetMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		double [] vet = new double [N];
		
		for (int i = 0; i < N; i++) {
			vet[i] = teclado.nextDouble();
			}
		
		for (int i = 0; i < N; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
				
		double soma = 0.0;
		
		for (int i = 0; i < N; i++) {
			soma += vet[i];
		}
		System.out.printf("%.2f\n", soma);
		
		double media = soma / N;
		
		System.out.printf("%.2f\n", media);
		
		
		teclado.close();
	}
}
