package algoritimodoproduto2;

import java.util.Scanner;

public class Algoritimodoproduto2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double p, d, pf;
		System.out.println("digite o preço do produto");
		p = ler.nextDouble();
		
		System.out.println("digite a porcentagem de desconto");
		d =  ler.nextDouble();
		
		pf = (p/100)*d;
		System.out.println("o preço final do produto é " + pf + " reais");
		ler.close();
		
		
	}
}
