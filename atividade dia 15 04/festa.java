package festa;

import java.util.Scanner;

public class festa {
 public static void main (String args[]) {
	 Scanner ler = new Scanner (System.in);
	 int m, f, salgados, doces, bebida, bolo;
	 System.out.println("digite a quantidae de pessoas do sexo masculino");
	 m = ler.nextInt();
	 
	 System.out.println("digite a quantidade de pessoas do  sexo  feminino");
	 f = ler.nextInt();
	 
	 salgados = (15*m)+(10*f);
     doces = (6*m)+ (8*f);
      bolo = (((m+f)*100)/1000  );
      bebida = ((600*m) + (500*f))/1000;
      
      System.out.println("A quantidade de salgados é " + salgados);
      System.out.println("A quantidade de doce é " + doces);
      System.out.println("A quantidade de bolo é " + bolo );
      System.out.println("A quantidade de bebida é " + bebida );
      ler.close();
 }
}
