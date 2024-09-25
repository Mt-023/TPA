package parede;
 import java.util.Scanner;
 
public class parede {
	public static void main (String args []) {
  Scanner ler = new Scanner(System.in);
  double c, l, tinta;
  System.out.println("digite o comprimento");
  c = ler.nextDouble();
   
  System.out.println("digite a largura");
  l = ler.nextDouble();
  
  tinta = (c*l)/3.8; 
  System.out.println("você precisa de " + tinta + " latas de tinta");
  ler.close();
	}
}
