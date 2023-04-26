import java.util.Scanner;

public class ListaCinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas: ");
        double numHoras = scanner.nextDouble();

        System.out.println("Digite quanto recebe por hora: ");
        double numRecebH = scanner.nextDouble();

        System.out.println("Número de filhos menores que 14 anos: ");
        double numFilhos = scanner.nextInt();

        double salarioFamilia = 56.47 * numFilhos;

        double salarioMensal = numHoras * numRecebH;

        double resultadoFinal = salarioMensal + salarioFamilia;

        System.out.println("O salário a ser recebido no fim do mês é de: " + resultadoFinal);
        scanner.close();
    }

}
