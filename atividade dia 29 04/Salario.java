package salario;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double s, d, sobra;
	
	System.out.println("digite o salário ");
	s = ler.nextInt();
	
	System.out.println("digite o valor das dividas ");
	d = ler.nextInt();
	
	sobra = (s-d);
	System.out.println("a sobra é " + sobra + " reais ");
	
	if(sobra>=1) {
	    System.out.println("irá sobrar ");   
		
	}else {
		System.out.println("irá faltar");
	}
	ler.close();	
	}

}
