package salario;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double s, d, sobra;
	
	System.out.println("digite o sal�rio ");
	s = ler.nextInt();
	
	System.out.println("digite o valor das dividas ");
	d = ler.nextInt();
	
	sobra = (s-d);
	System.out.println("a sobra � " + sobra + " reais ");
	
	if(sobra>=1) {
	    System.out.println("ir� sobrar ");   
		
	}else {
		System.out.println("ir� faltar");
	}
	ler.close();	
	}

}
