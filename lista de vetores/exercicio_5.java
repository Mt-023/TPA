package vetores;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }

        
        System.out.println("\nResultados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + A[i] + ":");
            System.out.print("Divisores: ");
            for (int j = 1; j <= Math.abs(A[i]); j++) { 
                if (A[i] % j == 0) { 
                    System.out.print(j + " ");
                }
            }
            System.out.println(); 
        }
    }
}
