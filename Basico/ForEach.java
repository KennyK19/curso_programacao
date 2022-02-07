import java.util.Scanner;

public class ForEach {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		String [] nomes = new String [N];
		
		for(int i = 0; i < N; i++) {
			nomes[i] = teclado.next();
		}
		
		System.out.println("Nomes lidos:");
		for (String s : nomes) {
			System.out.println(s);
		}
		
		teclado.close();
	}

}
