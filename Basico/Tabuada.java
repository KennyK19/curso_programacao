import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int n = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int num = 0;
			num = i * n;
		 System.out.printf("%d x %d = %d\n", i, n, num);
		}
		
		
		teclado.close();
	}

}
