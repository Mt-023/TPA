package vetores;

import java.util.Scanner;
public class exercicio14 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		final int TAM=5;
		int i,j,a[],b[],c[];
		a= new int[TAM];
		b= new int[TAM];
		c= new int[TAM];

		System.out.println("entre com os valores de A");
		
		for (i=0;i<TAM;i++) {
			a[i]= ler.nextInt();}
		
		for (j=0;j<TAM;j++) {
			b[j]= ler.nextInt();
			
				if(a[i]>b[j]) {
					c[i]=1;
				}else if(a[i]>b[j]){
					c[i]=-1;
				}else {
					c[i]=0;
				}
		}
		System.out.print("C: ");
		for (i=0;i<TAM;i++) {
			System.out.print(c[i]+ " ");
		}
		ler.close();
	}

}
