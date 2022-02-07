import java.util.Scanner;

public class NomeidadeM {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o seu nome:");
		String pessoa1 = teclado.next();
		System.out.println(pessoa1 + " Digite a sua idade:");
		int idadep1 = teclado.nextInt();
		
		System.out.println("Digite o seu nome:");
		String pessoa2 = teclado.next();
		System.out.println(pessoa2 + " Digite a sua idade:" );
		int idadep2 = teclado.nextInt();

		double media = (double)(idadep1 + idadep2) / 2;
		
		System.out.printf("A idade média de %s e %s é igual a %.1f anos", pessoa1, pessoa2, media);
		
		teclado.close();				
	}

}
