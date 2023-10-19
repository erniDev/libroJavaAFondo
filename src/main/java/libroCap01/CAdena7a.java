package libroCap01;
/**
 * Clase que divide una cadena de caracteres mediante un split, el caracter que define conde hacer el split |.
 * mediante un cliclo for
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class CAdena7a {
    public static void main(String[] args) {
        String s = " Juan| Marcos | Caelos | Matias";
        String token [] = s.split("[|]");

        for (int i = 0; i < token.length ; i++) {
            System.out.println(token[i]);
        }
    }
}
