package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //medir la cantidad de caracteres
        Scanner scanner = new Scanner(System.in);
        String text = "";
        System.out.println("Ingrese una hilera de caracteres");
        text = scanner.next();
        System.out.println("La hilera contiene " + text.length() + " caracteres");

    }
}
