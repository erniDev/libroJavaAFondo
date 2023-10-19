package libroCap01;

/**
 * Clase Concatena cadenas con + tardo con:
 *      n = 1000008  1679 milisegundos
 *      n = 1000000  113541 milisegundos
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
*/
public class Cadenas5b {
    public static void main(String[] args) {
        //Obtengo el milisegundo actual
        long hi = System.currentTimeMillis();
        String s = "";
        //Concatenar n caracteres
        int n = 1000000;

        char c;

        for (int i = 0; i < n; i++) {
            //Obtengo caracteres entre 'A' y 'Z'
            c = (char) ('A' + i% ('Z' - 'A' + 1));
            s += c;
        }
        //Obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        //Muestro la cadena resultante
        System.out.println(s);

        //Muestro la cantidad de milisegundos consumidos
        System.out.println(hf - hi + " milisegundos");
    }
}
