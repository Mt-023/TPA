package algoritimodoproduto;

import java.util.Scanner;

public class Algortimodoproduto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double p, d, pf;
		System.out.println("digite o preço do produto");
		p = ler.nextDouble();
		
		d = (p/100*5);
		System.out.println("o desconto é de " + d + " reais");
		ler.close();
		
		pf = (p-d);
		System.out.println("o preço final do produto é " + pf + " reais");
		ler.close();
		
	}
}
