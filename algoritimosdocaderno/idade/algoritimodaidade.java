package prjalgoritimodaidade;

import java.util.Scanner;

public class algoritimodaidade {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double an, aa, idade;
		System.out.println("digite a sua data de nascimento");
		 an = ler.nextDouble();
		
		System.out.println("digite o ano atual");
		aa = ler.nextDouble();
		
		idade = (aa-an); 
		System.out.println("a sua idade é " + idade + " anos");
		ler.close();
		
			
	}
}
