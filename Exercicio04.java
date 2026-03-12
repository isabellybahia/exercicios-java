// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = teclado.nextDouble();

        double novoSalario = salario * 1.07;

        System.out.println("Salário original: R$ " + salario);
        System.out.println("Novo salário: R$ " + novoSalario);

        teclado.close();
    }
}