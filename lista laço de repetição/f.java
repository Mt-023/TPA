import java.util.Scanner;


public class f {

	public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	   int p = 1,nf = 0, i = 1, an = 0, n,at= 1 ;
	   
	  System.out.println("coloque um número");
	  n = ler.nextInt();
	  
	  while (i<=n) {
		  System.out.println("sua serie é " + p);
		
		  p= an + at;
		  an = at;
		  at=p;
		  
		  i++;
		
	  }
	  ler.close();

	}

}
