package vetores;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];

        
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }

        
        System.out.println("\nTabuadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nTabuada de " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }
    }
}

