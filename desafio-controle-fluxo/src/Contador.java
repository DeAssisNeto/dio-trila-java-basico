import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int entradaUm = scanner.nextInt();
        System.out.println("Digite o primeiro parâmetro");
        int entradaDois = scanner.nextInt();

        contar(entradaUm, entradaDois);
    }

    private static void contar(int entradaUm, int entradaDois) throws ParametrosInvalidosException {
        if (entradaDois < entradaUm){
            throw new ParametrosInvalidosException();
        }
        int flagContar = entradaDois - entradaUm;

        for (int i=0; i<flagContar; i++){
            System.out.println(i);
        }
    }
}