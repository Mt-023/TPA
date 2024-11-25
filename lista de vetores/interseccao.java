package vetores;

import java.util.Scanner;

public class interseccao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAM = 10;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int[] c = new int[TAM]; 
        int k = 0; 

        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        // Encontrar a interseção entre A e B
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    
                    int jaAdicionado = 0; 
                    for (int l = 0; l < k; l++) {
                        if (c[l] == a[i]) {
                            jaAdicionado = 1; 
                            break;
                        }
                    }
                    
                    if (jaAdicionado == 0) {
                        c[k] = a[i];
                        k++;
                    }
                }
            }
        }

      
        System.out.println("\nInterseção dos vetores A e B (Vetor C):");
        if (k == 0) {
            System.out.println("Não há elementos comuns entre A e B.");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("C[" + i + "] = " + c[i]);
            }
        }

        scanner.close();
    }
}
