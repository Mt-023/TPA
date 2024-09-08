package algoritimodosalunos;

import java.util.Scanner;

public class Algoritimodosalunos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double nh, nm, p, total;
		System.out.println("digite a quantidade de alunos masculinos");
		nh = ler.nextDouble();
		
		System.out.println("digite a quantidade de alunas femininas");
		nm = ler.nextDouble();
		
		total = (nh+nm);
		System.out.println("a quantidade de alunos total  é " + total + " alunos");
		
		p = (nh*100)/total;
		System.out.println("a porcentagem de alunos nasculinos é " + p + " %");
		
		p = (nm*100)/total;
		System.out.println("a porcentagem de alunas femininas é " + p + " %");
		ler.close();
		
	}
}
