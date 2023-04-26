import java.util.Scanner;

public class ListaDez {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número (A): ");
        double numeroA = scanner.nextFloat();

        System.out.println("Digite o segundo número (B): ");
        double numeroB = scanner.nextFloat();

        System.out.println("Digite o terceiro número (C): ");
        double numeroC = scanner.nextFloat();

        double mediaA = (numeroA * numeroB * numeroC) / 3;
        double mediaH = 3 / ((1 / numeroA) + (1 / numeroB) + (1 / numeroC));
        double mediaG = Math.pow(numeroA * numeroB * numeroC, 1.0 / 3.0);

        System.out.println("Média Arítimetica: " + mediaA);
        System.out.println("Média Harmónica: " + mediaH);
        System.out.println("Média Geométrica: " + mediaG);
        scanner.close();

    }

}
