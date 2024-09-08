import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int num = scanner.nextInt();

        System.out.println("Insira um numero: ");
        int num2 = scanner.nextInt();

        if (num == num2) {
            int soma = num + num2;
            System.out.println("A soma dos dois numeros é: " + soma);
        } else {
            int mulpy = num * num2;
            System.out.println("Os dois numeros multplicados dão: " + mulpy);
        }


    }
}