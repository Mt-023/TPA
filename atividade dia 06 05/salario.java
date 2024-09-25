package salario;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double s;
	
	System.out.println("digite seu salário ");
	s = ler.nextInt();
	
	if(s<1302.00) {
		System.out.println("você recebe menos que um salário minímo ");
		
	}else if(s==1302.00) {
		System.out.println("você recebe um salário minímo ");
		
	}else
		System.out.println("você recebe mais que um salário minímo ");
	ler.close();
	}
   
}
