import java.util.Scanner;

public class Exec22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o tempo de viagem em minutos: ");
        Double tempoViagem = scanner.nextDouble() / 60;

        System.out.println("Ente com sua velocidade media: ");
        Double velocidadeMedia = scanner.nextDouble();

        Double distanciaEmKm = tempoViagem * velocidadeMedia;
        Double gasolinaUsada = distanciaEmKm / 12;
        System.out.println("Distnacia percorrida: " + distanciaEmKm + " litros de gasolina ultilzados: " + gasolinaUsada);

        scanner.close();
    }
}
