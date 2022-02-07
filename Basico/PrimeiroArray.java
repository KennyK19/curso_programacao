import java.util.Scanner;

public class PrimeiroArray {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int N = teclado.nextInt();
		double [] vet = new double [N];
		
		for (int i=0; i < N; i++) {
			vet[i] = teclado.nextDouble();
			
		}
	    
		for (int i=0; i<N; i++) {
			System.out.printf("%.2f\n", vet[i]);
		}
		
		
		teclado.close();
	}
}
