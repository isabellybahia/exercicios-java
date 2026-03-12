// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double COTACAO = 4.95;

        System.out.print("Digite o valor em dólar: ");
        double dolar = teclado.nextDouble();

        double reais = dolar * COTACAO;

        System.out.println("Valor convertido: R$ " + reais);

        teclado.close();
    }
}
