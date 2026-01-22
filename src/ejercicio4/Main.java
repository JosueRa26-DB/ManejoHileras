package ejercicio4;

import java.util.Scanner;

public class Main {

    //cambiar la frase a mayuscula y a minuscula
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.println(" Frase original: " + frase);
        System.out.println("Mayúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());
    }
}

