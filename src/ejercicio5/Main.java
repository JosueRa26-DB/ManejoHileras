package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Busqueda dentro de una hilera
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese la palabra para verificar si se encuentra en la palabra: ");
        String palabra = scanner.nextLine();

        if (frase.contains(palabra)) {
            System.out.println("La palabra se encuentra en la frase");

        } else {
            System.out.println("La palabra no se encuentra en la frase");
        }

    }
}
