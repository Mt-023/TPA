package salario;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double s;
	
	System.out.println("digite seu sal�rio ");
	s = ler.nextInt();
	
	if(s<1302.00) {
		System.out.println("voc� recebe menos que um sal�rio min�mo ");
		
	}else if(s==1302.00) {
		System.out.println("voc� recebe um sal�rio min�mo ");
		
	}else
		System.out.println("voc� recebe mais que um sal�rio min�mo ");
	ler.close();
	}
   
}
