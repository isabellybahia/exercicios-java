// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (em cm): ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura (em cm): ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("Área do retângulo: " + area + " cm²");

        scanner.close();
    }
}