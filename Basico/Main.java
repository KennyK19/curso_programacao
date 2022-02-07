import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    
	    double n = 3.14159;
	    double A, raio;
	    
	    System.out.println("Digite o tamanho do raio:");
	    raio = entrada.nextDouble();
	    
	    A = n * raio * raio;
	    
	    System.out.printf("A=%.4f\n", A);
	    
	    entrada.close();
	    
	}

}
