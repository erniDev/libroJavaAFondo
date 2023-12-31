package libroCap01;

import java.util.Scanner;

/**
 * Clase pide al usuario que ingrese su nombre, edad, altura; luego mostrarlo por consola
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class HolaMundoNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Mensaje para el usuario
        System.out.println("Ingrese Nombre, edad, altura: ");

        // Leemos nombre
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.println();

        //Leemos edad
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.println();

        //Leemos altura
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        //Mostramos los datos por consola
        System.out.println("Nombre: " + nom + ", Edad: " + edad + ", Altura: " + altura);


    }
}
