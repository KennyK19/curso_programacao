import java.util.Scanner;



public class CrescenteDecrescente {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");	
			}else 
			     {
				System.out.println("Decrescente");
			}
			x = teclado.nextInt();
			y = teclado.nextInt();
		}
		
		
		teclado.close();
	}

}
