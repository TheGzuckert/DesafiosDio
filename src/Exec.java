import java.util.Scanner;

public class Exec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numA = scanner.nextInt();

        System.out.println("Digite um numero: ");
        int numB = scanner.nextInt();

        System.out.println("Digite um numero: ");
        int numC = scanner.nextInt();

        int soma = numA + numB;
        System.out.println("Soma do primeiro numero e o segundo numero informado: " + soma);


        String comparacao = soma < numC ? "A soma é menor do que " + numC : "A soma é maior ou igual a " + numC;
        System.out.println(comparacao);


    }
}