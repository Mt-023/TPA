package vetores;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM=5;
		int i,j,k = 0,c[],a[],b[];
		a= new int[TAM];
		b= new int[TAM];
		c= new int[TAM];
		
		System.out.println("entre com os valores de A");
		
		for (i=0;i<TAM;i++) {
			a[i]= ler.nextInt();
	}
		
		System.out.println("entre com  valor de B");
		
		for(i=0;i<TAM;i++){
			b[i]= ler.nextInt();
			
			for(j=0; j<TAM;j++) {
				if(b[i]==a[j]) {
					c[j]=b[i];
					c[j]=0;
					k++;
				}
			}
		}
		System.out.print("C � igual: ");
		for(i=0;i<k;i++) {
			System.out.print(c[i]);
		}
	}
}
