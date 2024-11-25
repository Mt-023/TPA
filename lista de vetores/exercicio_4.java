package vetores;

import java.util.Scanner;

public class exercicio_4 {
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
            for (int j = 0; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); 
        }
    }
}
