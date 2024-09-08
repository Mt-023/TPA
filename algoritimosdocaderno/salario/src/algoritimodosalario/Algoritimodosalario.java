package algoritimodosalario;

import java.util.Scanner;

public class Algoritimodosalario {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double s, nd, sf;
		System.out.println("digite o salário");
		s = ler.nextDouble();
		
		System.out.println("digite o número de dependente(s)");
		nd = ler.nextDouble();
		
		sf = (55*nd+s);
		System.out.println("o salário final é " + sf + " reais");
		ler.close();
		
				
		
	}
}
