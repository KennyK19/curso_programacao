import java.util.Scanner;

public class Conversorsegminhor {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int N = teclado.nextInt();
		
		int horas, minutos, segundos, resto;
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		teclado.close();
	}

}
