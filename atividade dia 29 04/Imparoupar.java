package imparoupar;

import java.util.Scanner;

public class Imparoupar {
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
      int n;
     
     System.out.println("digite um n�mero");
     n = ler.nextInt();
       
     if(n%2>=1) {
    	 System.out.println("esse n�mero � impar");	 
    	 
     }else {
    	 System.out.println("esse n�mero � par");
     }
     
     ler.close();	 
    	 
     
	}
}
