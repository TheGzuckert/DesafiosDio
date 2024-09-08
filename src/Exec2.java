import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Numero é par");
        } else {
            System.out.println("Numero impar");
        }
    }
}