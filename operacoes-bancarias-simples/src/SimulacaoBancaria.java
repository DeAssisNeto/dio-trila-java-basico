import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.

            switch (opcao){
                case(0):
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                case(1):
                    saldo = scanner.nextInt();
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case(2):
                    int sacar = scanner.nextInt();
                    if (sacar > saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    saldo -= sacar;
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case(3):
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
