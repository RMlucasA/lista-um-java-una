import java.util.Scanner;

public class ListaDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float numCompra = scanner.nextInt();

        double dezPorc = numCompra * (0.1);

        double numFinal = numCompra + dezPorc;

        System.out.println("O valor final da compra é: " + numFinal);
        scanner.close();

    }
}
