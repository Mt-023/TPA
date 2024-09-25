package peso;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1; 

        while (continuar == 1) {
            System.out.print("Digite o sexo (f para feminino, m para masculino): ");
            String sexo = scanner.next(); 

            System.out.print("Digite a altura em metros: ");
            double altura = scanner.nextDouble();

            double pesoIdeal;

            if (sexo.equalsIgnoreCase("m")) {
                pesoIdeal = 52 + (0.75 * ((altura * 100) - 152.4)); 
            } else if (sexo.equalsIgnoreCase("f")) {
                pesoIdeal = 52 + (0.67 * ((altura * 100) - 152.4)); 
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
                continue; 
            }

            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

            System.out.print("Deseja continuar a execução? (1-para SIM ou 2-para NÃO): ");
            continuar = scanner.nextInt();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}