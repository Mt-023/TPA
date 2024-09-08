package algoritimodosmeses;

import java.util.Scanner;

public class Algoritimodosmeses {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double d, m, a;
		System.out.println("digite a quantidade de dias");
		d = ler.nextDouble();
		
		m = (d/30);
		System.out.println("a quantidade de dias é " + m + " meses");
		ler.close();
	
	
		a = (m/12);
		System.out.println("a quantidade de dias é " + a + " anos");
		ler.close();
			

		
		
		
		
		
	}
}
