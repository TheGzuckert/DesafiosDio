import java.util.*;

public class Exec15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        System.out.println("Insira o mes de nascimento: ");
        int mesNascimento = scan.nextInt();

        System.out.println("Dia de nascimento: ");
        int diaNascimento = scan.nextInt();

        int anoAtual = 2024;
        int mesAtual = 9;
        int diaAtual = 12;

        int anosVividos = anoAtual - anoNascimento;
        int mesesVividos = mesAtual - mesNascimento;
        int diasVividos = diaAtual - diaNascimento;


        if (diasVividos < 0) {
            diasVividos += 30;
            mesesVividos--;
        }

        if (mesesVividos < 0){
            mesesVividos +=12;
            anosVividos--;
        }

        int totalDiasVividos = anosVividos * 365 + mesesVividos * 30 + diasVividos;

        System.out.println("Você viveu " + anosVividos + " anos, " + mesesVividos + " meses e " + diasVividos + " dias.");
        System.out.println("Total de dias vividos: " + totalDiasVividos);

    }
}
