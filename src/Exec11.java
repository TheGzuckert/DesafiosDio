import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota do aluno:");
        double nota = scanner.nextDouble();

        System.out.println("Insira a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota do aluno:");
        double nota3 = scanner.nextDouble();

        System.out.println("Insira a terceira nota do aluno:");
        double nota4 = scanner.nextDouble();

        double media = (nota + nota2 + nota3 + nota4) / 4;
        System.out.println("Media: " + media);

        if(media >7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }


    }
}
