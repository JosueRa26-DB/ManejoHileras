package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera hilera: ");
        String hilera1 = scanner.nextLine();

        System.out.print("Ingrese la segunda hilera: ");
        String hilera2 = scanner.nextLine();

        if (hilera1.equalsIgnoreCase(hilera2)) {
            System.out.println("Las hileras son iguales");
        } else {
            System.out.println("Las hileras son distintas");
        }
    }
}

