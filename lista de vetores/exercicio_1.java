package vetores;


import java.util.Scanner;

public class exercicio_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int parIndex = 0;
        int imparIndex = 19; 

       
        System.out.println("Digite 20 números para o vetor A:");
        for (int i = 0; i < 20; i++) {
            A[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[parIndex] = A[i];
                parIndex++;
            } else {
                B[imparIndex] = A[i];
                imparIndex--;
            }
        }

        
        System.out.println("Vetor B");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
    }
}



