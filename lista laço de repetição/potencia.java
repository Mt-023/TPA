import java.util.Scanner;

public class potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int b, e, p = 1, i = 0;
		
		System.out.println("coloque a base");
		b = ler.nextInt();
		
		System.out.println("coloque o expoente");
		e = ler.nextInt();
		
		while (i < e) {
			p = p*b;
			i++;
			System.out.println("sua potencia � " + p);
		}
		ler.close();
	}
}

