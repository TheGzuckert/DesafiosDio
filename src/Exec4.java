import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int num = scanner.nextInt();
        int subtraiu = num - 1;
        System.out.println("subtraiu " + subtraiu);
        int soma = num + 1;
        System.out.println("soma " + soma);
    }
}