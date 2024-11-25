package vetores;

import java.util.Scanner;

public class exercico_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

       
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }

       
        System.out.println("\nResultados:");
        for (int i = 0; i < 10; i++) {
            int num = A[i];
            boolean isPrimo = true;

            if (num <= 1) {
                isPrimo = false; 
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrimo = false;
                        break; 
                    }
                }
            }

           
            System.out.print("Elemento " + num + " - ");
            if (isPrimo) {
                System.out.println("É primo.");
            } else {
                System.out.println("Não é primo.");
            }
        }
    }
}

