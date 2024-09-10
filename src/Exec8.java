import java.util.*;

public class Exec8 {
    public static void main(String[] args) {

       List<Integer> valores = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor: ");
        int valA = scanner.nextInt();
        valores.add(valA);

        System.out.println("Entre com um valor: ");
        int valB = scanner.nextInt();
        valores.add(valB);

        System.out.println("Entre com um valor: ");
        int valC = scanner.nextInt();
        valores.add(valC);

        // invertemos a lista
        Collections.sort(valores, Collections.reverseOrder());

        // ForEach somente para exibir os valores linha por linha
        for(int valor: valores){
            System.out.println(valor);
        }

        scanner.close();

    }
}
