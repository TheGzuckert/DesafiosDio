import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args) {
        //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        double porcentagem = 0.05;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entree com um valor: ");
        double valor = scanner.nextDouble();
        double operacao = valor - (valor * porcentagem);
        System.out.println("Resultado: " + operacao);
        scanner.close();
    }
}
