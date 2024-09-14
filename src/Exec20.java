import java.util.Scanner;

public class Exec20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Integer num = scanner.nextInt();

        Integer calc = 0;

        for (int i = 0; i < 11; i++) {
            calc = i * num;
            System.out.println(num + " x " + i + " = " + calc);
        }
    }
}
