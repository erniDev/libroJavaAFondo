package libroCap01;
/**
 * Clase compara 2 cadenas de caracterers si son iguales
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class Cadenas9 {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";

        System.out.println("s1 = [" + s1 + "]");
        System.out.println("s2 = [" + s2 + "]");


        if (s1 == s2){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}
