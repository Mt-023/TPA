package vetores;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[15];
        long[] B = new long[15]; 

        
        System.out.println("Digite 15 números inteiros não negativos para o vetor A:");
        for (int i = 0; i < 15; i++) {
            A[i] = scanner.nextInt();
            while (A[i] < 0) { 
                System.out.println("Número negativo! Por favor, digite um número não negativo:");
                A[i] = scanner.nextInt();
            }
        }

        
        for (int i = 0; i < 15; i++) {
            B[i] = calcularFatorial(A[i]);
        }

        
        System.out.println("\nVetor A e seu respectivo fatorial no vetor B:");
        for (int i = 0; i < 15; i++) {
            System.out.println("A[" + i + "] = " + A[i] + " -> B[" + i + "] = " + B[i]);
        }
    }

    
    public static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
