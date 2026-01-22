package ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Validacion de contraseña
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña (8 caracteres):  ");
        String password = scanner.nextLine();

        if (password.length() >= 8 && password.matches(".*[A-Z].*")) {
            System.out.println("contraseña valida");
        } else {
            System.out.println("Contraseña invalida");
        }

    }
}
