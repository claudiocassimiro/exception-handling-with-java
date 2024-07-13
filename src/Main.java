import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySet mySet = new MySet();

        while (true) {
            System.out.print("Insira um número (negativo para sair): ");
            short value = scanner.nextShort();

            if (value < 0) {
                break;
            }

            try {
                mySet.addNumber(value);
                System.out.println("Número adicionado: " + value);
            } catch (MySetException e) {
                System.out.println("entrei");
                System.out.println("Erro: " + e.getMessage());
            }

            mySet.showNumbers();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}