package libroCap01;

import java.util.StringTokenizer;
/**
 * Clase que divide una cadena de caracteres mediante un split, el caracter que define conde hacer el split |.
 * mediante un cliclo while
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class Cadenas7 {
    public static void main(String[] args) {
        String s = " Juan| Marcos | Caelos | Matias";
        StringTokenizer st = new StringTokenizer(s, "|");

        String tok ;

        while (st.hasMoreTokens()){
            tok = st.nextToken();
            System.out.println(tok);
        }

    }
}
