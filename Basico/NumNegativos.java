import java.util.Scanner;

public class NumNegativos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int N = teclado.nextInt();
		int [] vet = new int [N];
		
		for (int i = 0; i < N; i++) {
			vet[i] = teclado.nextInt();			
		}
		
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		teclado.close();
	}
	
}
