import java.util.Scanner;

public class Exec9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Insira seu peso:  ");
        double peso = scanner.nextDouble();

        double mmc = peso / (altura * altura);
        System.out.println("Seu mmc teste: " + mmc);

        if(mmc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (mmc > 18.5 || mmc <= 24.9){
            System.out.println("Peso ideal");
        } else if (mmc > 25.0 || mmc <= 29.9){
            System.out.println("Levemente acida do peso");
        } else if (mmc > 30.0 || mmc <= 34.9){
            System.out.println("Obesidade grau 1");
        } else if (mmc > 35.0 || mmc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else if (mmc > 40.0) {
            System.out.println("Obesidade grau 3");
        }
        scanner.close();
    }
}
