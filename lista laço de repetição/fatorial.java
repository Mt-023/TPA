import java.util.Scanner;

public class fatorial {
	
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
			System.out.print("Digite um número para calcular o fatorial: ");
			int n = ler.nextInt();  
			
			int f = 1;  
			int i = n; 
			
			
			while (i >= 1) {
			    f = f * i; 
			    i--;  
			}
			
			
			System.out.println("O fatorial de " + n + " é: " + f);
		}
    
    }



