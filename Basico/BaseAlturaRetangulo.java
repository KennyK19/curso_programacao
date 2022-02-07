import java.util.Scanner;

public class BaseAlturaRetangulo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double area,peri,diag;
		
		System.out.println("Digite o valor da base:");
		double base = teclado.nextDouble();
		
		System.out.println("Digite o  valor da altura:");
		double alt = teclado.nextDouble();	
				
		area = base * alt;
		
		peri = 2 * (base + alt);
		
		diag = Math.sqrt (Math.pow(base, 2.0) + Math.pow(alt, 2.0));
		
		System.out.printf("Valor da Área: %.4f\n", area);
		System.out.printf("Valor do Perimetro: %.4f\n", peri);
		System.out.printf("Valor da Diagonal: %.4f\n", diag);
				
		teclado.close();		
	}

}
