import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o sua idade: ");
        int idade = scanner.nextInt();

        if(idade >18){
            System.out.println("Maior de idade pode beber");
        } else {
            System.out.println("Menor de idade pode beber");
        }
    }
}
