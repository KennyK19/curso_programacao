import java.util.Scanner;

public class DesafioAiron {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de clientes:");
		int N = teclado.nextInt();
		String []cliente = new String [N];
		int [] idade = new int [N];
		double [] salario = new double [N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite o nome:");
			cliente [i] = teclado.next();
			System.out.println("Digite a idade:");
			idade [i] = teclado.nextInt();
			System.out.println("Digite o salario");
			salario [i] = teclado.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			if (salario[i] > 2500 && (idade[i] > 25 || idade[i] < 35)) {
				System.out.printf("%s tem %d anos e um salário de R$%.1f.\n", cliente[i],idade[i],salario[i]);
			}
		}
		
		teclado.close();
	}

}
