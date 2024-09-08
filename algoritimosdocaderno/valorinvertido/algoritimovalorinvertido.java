package prjalgoritimovalorinvertido;

import java.util.Scanner;

public class algoritimovalorinvertido {
	 public static void main (String args[]) {
		 Scanner ler = new Scanner(System.in);
		 double a, b, casa;
		 System.out.println("digite o valor de A: ");
		 a = ler.nextDouble();
		 
		 System.out.println("digite o valor de B: ");
		 b = ler.nextDouble();
		 
		 casa = a;
		 a = b;
		 b = casa;
		 System.out.println("Os valores invertidos são:");
		 System.out.println("a: " + a);
		 System.out.println("b: " + b);
		 ler.close();
		 
		 		 
	 }
}
