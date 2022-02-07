import java.util.Scanner;

public class Menornum {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		int num3 = teclado.nextInt();

		
		if (num1 < num2 && num1 < num3) {
			System.out.println("Menor = " + num1);
	  } else if (num2 < num3) {
		    System.out.println("Menor = " + num2);
      } else {
		    System.out.println("Menor = " + num3);
	} 
		
	teclado.close();	
	}

}
