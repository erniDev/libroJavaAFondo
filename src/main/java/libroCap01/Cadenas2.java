package libroCap01;
/**
 * Clase que mustra la posicion de caracteres especificos de una cadena de caracteres utilizando:
 * indecOf() -> Permite saber el index de una letra especifica
 * lastIndexOf() -> Permite saber el index de la ultima posicoin de un caracter especifico
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class Cadenas2 {
    public static void main(String[] args) {
        String s = "Esto Es Una Cadena de caracteres";

        int pos1 = s.indexOf('C');
        int pos2 = s.lastIndexOf('C');
        int pos3 = s.indexOf('x'); // Si no se encuentra el caracter en la cadena el valor es negativo

        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
