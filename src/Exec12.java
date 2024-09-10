import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor desejado: ");
        double valor = scanner.nextDouble();

        while (menu){
            System.out.println("""
                    1 - A vista
                    2 - A vista no credito
                    3 - Parcelar em 2x no cartão sem juros
                    4 - Parcelar em 3x
                    5 - Encerrar sistema!
                    """);
            int alternative = scanner.nextInt();

            switch (alternative){
                case 1:
                    double desconto = valor - (valor * 0.10);
                    System.out.println("Valor pago a ser pago: " + desconto) ;
                    break;
                case 2:
                    double desconto2 = valor - (valor * 0.10);
                    System.out.println("Valor a ser pago: " + desconto2);
                    break;
                case 3:
                    double parcela = valor / 2;
                    System.out.println("Valor pago a ser pago 2x: " + parcela);
                    break;
                case 4:
                    double parcela2 = (valor / 3) + (valor * 0.10);
                    System.out.println("Valor a ser pago em 3x: " + parcela2);
                    break;
                default:
                    System.out.println("Programa encerrado!!!");
                    break;
            }
        }


    }
}
