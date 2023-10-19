package libroCap01;
/**
 * Clase permite que se divida una cadena de caracteres mediante sbstring utilizando el index de la primera posicion
 * que queremos que se divica hasta la ultima pisicion, o las posiciones iniciales
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class Cadenas3 {
    public static void main(String[] args) {
        String s = "Esto es una cadena de caracteres";

        String s1 = s.substring(0, 7);
        String s2 = s.substring(8, 11);

        //Tomo desde el caracter 8 hasta el final
        String s3 = s.substring(8);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
