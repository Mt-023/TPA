package eleição;

import java.util.Scanner;

public class Algoritimodaeleição {
	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double e, n, i;
    
    System.out.println("digite o ano da proxima eleição");
    e = ler.nextDouble();
    
    System.out.println("digite o ano de nascimento");
    n = ler.nextDouble();
    
    i = (e-n);
    System.out.println("sua idede é " + i + " anos ");
    
    if(i<18) {
         System.out.println("você não poderá votar");
      	 
    }else {
         System.out.println("você poderá votar");
    }
    ler.close();
    
	}

}
