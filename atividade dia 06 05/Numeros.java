package numeros;

import java.util.Scanner;

public class Numeros {
      public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);  
	  double n;
	  
	  
	  System.out.println("digite o n�mero" );
	  n=ler.nextDouble();
	  
	  if (n==0) {
		  System.out.println("seu n�mero � neutro" );  	  
	  }
	  else if (n>=1) {
		  System.out.println("seu n�mero � positivo" );
	  }
	  else {
		  System.out.println("seu n�mero � negativo" );
	  }
	  ler.close();
	}
}
