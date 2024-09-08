import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1293;
        System.out.println("Um salario minimo é " + salarioMinimo + " por favor insira quantos voce recebe: ");
        double salario = sc.nextInt();

        double recebe = salario / salarioMinimo;
        System.out.println("Voce recebe cerca de: " + recebe + "salarios minimos");
    }
}
