package ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Invertir una hilera
        Scanner scanner = new Scanner(System.in);
        String palabraInvertida = "";
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        for (char caracter : palabra.toCharArray()) {
            palabraInvertida = caracter + palabraInvertida; 
        }
        System.out.println(palabraInvertida);

    }
}
