package libroCap01;

import java.util.Scanner;

public class HolaMundoNombre {
    public static void main(String[] args) {
        // Permite leer datos por el teclado
        Scanner sc = new Scanner(System.in);

        // Mensaje para el usuario
        System.out.println("Ingrese su nombre: ");

        //Leemos el valor entero por el teclado
        String nom = sc.nextLine();

        // Mostramos el mensaje y luego el valor leido
        System.out.println("Hola Mundo " + nom);

    }
}
