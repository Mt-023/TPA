package elei��o;

import java.util.Scanner;

public class Algoritimodaelei��o {
	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double e, n, i;
    
    System.out.println("digite o ano da proxima elei��o");
    e = ler.nextDouble();
    
    System.out.println("digite o ano de nascimento");
    n = ler.nextDouble();
    
    i = (e-n);
    System.out.println("sua idede � " + i + " anos ");
    
    if(i<18) {
         System.out.println("voc� n�o poder� votar");
      	 
    }else {
         System.out.println("voc� poder� votar");
    }
    ler.close();
    
	}

}
