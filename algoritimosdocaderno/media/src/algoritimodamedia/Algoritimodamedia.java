package algoritimodamedia;

import java.util.Scanner;

public class Algoritimodamedia {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, m;
		System.out.println("digite a primeira nota");
		n1 = ler.nextDouble();
		
		System.out.println("digite a segunda nota");
		n2 = ler.nextDouble();
		
		m = (n1+n2)/2;
		System.out.println("a sua media é " + m + " pontos");
		ler.close();
		
		
		
		
		
		
		
	}
	
}
