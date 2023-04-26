import java.util.Scanner;

public class ListaTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o número de graus em Fahrenheit: ");
        double numFa = scanner.nextInt();

        double numCent = (numFa - 32) * 5 / 9;

        System.out.println("A temperatura em graus Celsius é de: " + numCent);
        scanner.close();
    }
}