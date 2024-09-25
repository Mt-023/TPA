package prjAlgoritimodoeuro;

import java.util.Scanner;

public class Euro {
    public static void main (String args[]) {
	    Scanner ler = new Scanner(System.in);
	    double e, c, reais;
	    System.out.println("digite o valor em euros");
	    e = ler.nextDouble();
	    
	    System.out.println("digite a cotação");
	    c = ler.nextDouble();
	    
	    reais = (e*c);
	    System.out.println("o valor de euros em reais é " + reais + " reais");
	    ler.close();
    }
	
}
