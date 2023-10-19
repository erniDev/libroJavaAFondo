package libroCap01;

import java.util.Scanner;
/**
 * Clase pide tu nombre y imprime un hola mundo con el
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
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
