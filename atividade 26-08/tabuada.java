import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, n, r; 
		System.out.println("entre com um n�mero");
		n = ler.nextInt();
		
		while (i<11) {
			r=n*i;
			System.out.println(n+"x"+i+"="+r);
			i = i+1;
		}
        ler.close();
	}

}
