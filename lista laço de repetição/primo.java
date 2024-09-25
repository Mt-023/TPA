import java.util.Scanner;


public class primo {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, d = 2, cd = 0;
		
		System.out.println("entre com um número");
		n = ler.nextInt();
		
		if (n<2) {
			System.out.println(n + " não é primo.");
		} else {
			while (d<n) {
				if (n % d == 0) {
					cd++;
				}
				d++;
			}
			if (cd == 0) {
			   System.out.println(n + " é primo");
			} else {
				System.out.println(n + " não é primo");
			}
			
		}
		ler.close();
	}
}
