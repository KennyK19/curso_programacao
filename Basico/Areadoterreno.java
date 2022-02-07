import java.util.Scanner;

public class Areadoterreno {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double larg, comp, valmetro, area, preco;
		
		System.out.println("Digite a largura do terreno:");
		larg = entrada.nextDouble();
		
		System.out.println("Digite o comprimento do terreno:");
		comp = entrada.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado do terreno:");
		valmetro = entrada.nextDouble();
		
		area = larg * comp ;
        
		preco = area * valmetro;
		
		System.out.printf("A largura do terreno é %.1f\nO comprimento do terreno é %.1f\n", larg, comp);
		System.out.printf("O valor do metro quadrado é %.2f\n", valmetro);
		System.out.printf("A área do terreno é %.2f e o preço do terreno é %.2f", area, preco );
		
		
		entrada.close();
	}

}
