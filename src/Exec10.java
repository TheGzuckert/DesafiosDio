import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota do aluno:");
        double nota = scanner.nextDouble();

        System.out.println("Insira a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();

        double media = (nota + nota2 + nota3) / 3;
        System.out.println("As notas do aluno são: " + media);
    }
}
