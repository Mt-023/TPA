package imparoupar;

import java.util.Scanner;

public class Imparoupar {
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
      int n;
     
     System.out.println("digite um número");
     n = ler.nextInt();
       
     if(n%2>=1) {
    	 System.out.println("esse número é impar");	 
    	 
     }else {
    	 System.out.println("esse número é par");
     }
     
     ler.close();	 
    	 
     
	}
}
