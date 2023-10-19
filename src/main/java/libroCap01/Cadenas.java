package libroCap01;

public class Cadenas {
    /**
     * Clase que permite dividir una cadena de caracteres en cada caracter
     * @author Erick Nicolas Gonzalez Rojas
     * @version 1.0 19/10/2023
     */
    public static void main(String[] args) {
        String s = "Esta es mi cadena";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(s.length() - 1));

        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            System.out.println(i + " -> " + c);
        }
    }
}
