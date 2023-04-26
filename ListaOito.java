import java.util.Scanner;

public class ListaOito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tatal de veículos no local: ");
        int veiculos = scanner.nextInt();

        System.out.println("Digite o total de rodas no local: ");
        int rodas = scanner.nextInt();

        int carros = (2 * veiculos - (rodas / 2)) / 2;
        int motos = veiculos - carros;

        System.out.println("No local tem" + motos + "motos e " + carros + "carros.");
        scanner.close();

    }

}
