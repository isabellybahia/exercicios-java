// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Valor pago: ");
        double pago = scanner.nextDouble();

        if (pago < preco) {
            System.out.println("Valor pago insuficiente.");
        } else {
            double troco = pago - preco;
            System.out.printf("Troco: R$ %.2f\n", troco);
        }

        scanner.close();
    }
}