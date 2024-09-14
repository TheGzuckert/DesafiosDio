import java.util.Scanner;

public class Exec19 {
    public static void main(String[] args) {

        Integer num = 0;
        Integer calc = 0;

        while (num <= 10){
            for (int i = 0; i < 11; i++) {
                calc = i * num;
                System.out.println(num + " x " + i + " = " + calc);
            }
            System.out.println("\nProxima tabuada!!!!!\n");
            num++;
        }
    }
}
