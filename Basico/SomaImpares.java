import java.util.Scanner;

public class SomaImpares {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		
		int min, max;
		if (x < y) {
			min = x;
			max = y;			
		}else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for (int i=min+1; i < max; i++) {
		     if (i % 2 != 0) {
		    	 soma = soma + i;
		     }
		}
		
		System.out.println(soma);
		
		
		teclado.close();
	}

}
