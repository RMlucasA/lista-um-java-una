import java.util.Scanner;

public class ListaSete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor total das vendas realizadas no mês: ");
        double valorVendas = scanner.nextDouble();

        System.out.println("Digite a porcentagem total pelas vendas: ");
        double porcentagemVendas = scanner.nextDouble();

        double porcentagem = porcentagemVendas / 100;

        double totalVendas = valorVendas * porcentagem;

        double totalSalario = salarioFixo + totalVendas;

        System.out.println("O valor total a ser recebido é de: " + totalSalario);
        scanner.close();
    }
}
