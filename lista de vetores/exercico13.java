package vetores;
import java.util.Scanner;
public class exercico13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM=5;
		int i,a[],b[];
		a= new int[TAM];
		b= new int[TAM];

		System.out.println("entre com os valores de A");
		
		for (i=0;i<TAM;i++) {
			a[i]= ler.nextInt();
			
				if(a[i] % 2 == 0) {
					b[i]=1;
				}else {
					b[i]=0;
				}		
		}
		System.out.print("B: ");
		for (i=0;i<TAM;i++) {
			System.out.print(b[i]+ " ");
		}
		ler.close();
	}
}