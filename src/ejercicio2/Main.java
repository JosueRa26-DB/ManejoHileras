package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String text = scanner.next();
        System.out.println("Primer caracter: " + text.charAt(0));
        System.out.println("Ultimo caracter: " + text.charAt(text.length() -1));
    }
}
