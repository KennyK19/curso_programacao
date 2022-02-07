import java.util.Scanner;

public class PlanoTelefonia {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int minutos = teclado.nextInt();
		
		int conta = 50;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2; 
		}
		
		System.out.println("Valor a pagar: R$ " + conta);
		
	teclado.close();
	}

}
