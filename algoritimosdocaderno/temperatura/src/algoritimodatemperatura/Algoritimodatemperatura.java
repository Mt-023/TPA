package algoritimodatemperatura;

import java.util.Scanner;

public class Algoritimodatemperatura {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double c, fahrenheit;
		System.out.println("digite a temperatura em graus celsius");
		c = ler.nextDouble();
		
		fahrenheit = (c*1.8+32);
		System.out.println("a temperatura em grau celsius é " + fahrenheit + " fahrenheit");
		ler.close();
		
		
		
		
		
	}
}
