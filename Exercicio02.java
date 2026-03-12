// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite X: ");
        int x = teclado.nextInt();

        System.out.print("Digite Y: ");
        int y = teclado.nextInt();

        int resto = x % y;

        System.out.println("O resto da divisão de " + x + " por " + y + " é: " + resto);

        teclado.close();
    }
}