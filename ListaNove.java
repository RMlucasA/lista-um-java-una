import java.util.Scanner;

public class ListaNove {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os segundos desejados: ");
        int segundos = scanner.nextInt();

        int minutos = segundos / 60;
        float horas = minutos / 60;

        System.out.println(+segundos + " são " + minutos + " minuto(s) ou " + horas + " hora(s).");
        scanner.close();

    }

}
