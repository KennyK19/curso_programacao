import java.util.Locale;
import java.util.Scanner;

public class Nota {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media < 60.0) {			
			System.out.println("Nota final = " + media + " Aluno Reprovado");
		}else {			
			System.out.println("Nota final = " + media + " Aluno Aprovado");
		}
		
		teclado.close();
	}

}
