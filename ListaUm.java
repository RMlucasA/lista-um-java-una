import java.util.Scanner;

public class ListaUm {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float numeroUm = scanner.nextInt();

        System.out.println("Digite outro número: ");
        float numeroDois = scanner.nextInt();

        float resultadoMedia = (numeroUm + numeroDois) / 2;

        System.out.println("O resultado da MÉDIA é: " + resultadoMedia);
        scanner.close();
    }
}