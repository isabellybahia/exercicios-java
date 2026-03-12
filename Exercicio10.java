// Nome: Isabelly Alves
// Matrícula: 1261946888

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Velocidade média (km/h): ");
        double velocidade = scanner.nextDouble();

        double tempoHoras = distancia / velocidade;

        int horas = (int) tempoHoras;
        int minutos = (int) ((tempoHoras - horas) * 60);

        System.out.println("Tempo estimado: " + horas + " horas e " + minutos + " minutos");

        scanner.close();
    }
}