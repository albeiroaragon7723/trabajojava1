package co.com.ps.trabajosenclases;
import java.util.Scanner;
public class trabajo1 {  //promerio
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double total;

        Integer num1Wrapper = 0;
        Integer num2Wrapper = 0;
        Integer num3Wrapper = 0;
        Double totalwrapper;

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Escribe El Primer Numero");
        num1 = scanner.nextInt();

        System.out.println("Escribe El Segundo Numero");
        num2 = scanner.nextInt();

        System.out.println("Escribe El Tercer Numero");
        num3 = scanner.nextInt();

        System.out.println("el promedio de los numero es  " + ((num1 + num2 + num3) / 3));

    }
}

