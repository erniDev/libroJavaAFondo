package libroCap01;
/**
 * Clase que muestra como convertir una cadena de caracteres a mayuscula o a minuscula
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */

public class Cadenas1 {
    public static void main(String[] args) {
        String cad = "Esto es una cadena de caracteres";
        String mayus = cad.toUpperCase();
        String nimus = cad.toLowerCase();

        System.out.println("Original: " + cad);
        System.out.println("Mayusaculas: " + mayus);
        System.out.println("Minusculas: " + nimus);

    }
}
