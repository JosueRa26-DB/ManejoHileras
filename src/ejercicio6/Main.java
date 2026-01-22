package ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //contar vocales
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una hilera: ");
        String texto = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.toLowerCase().charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                count++;
            }
        }
        System.out.println("La hilera contiene " + count + " vocales");

    }
}
