// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Combustível gasto (litros): ");
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("Consumo médio: %.1f km/l\n", consumo);

        scanner.close();
    }
}
