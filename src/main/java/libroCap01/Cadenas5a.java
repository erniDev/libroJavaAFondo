package libroCap01;
/*
    Concatenar cadenas con StringBuffer
        tardo con n = 1000008  8 milisegundos
                  n = 1000000  25 milisegundos
*/
public class Cadenas5a {
    public static void main(String[] args) {
        //Obtengo el milisegundo actual
        long hi = System.currentTimeMillis();

        //Instancio un StringBufer inicialmente vacio
        StringBuffer sb = new StringBuffer();

        //Concatenar n caracteres
        int n = 1000000;

        char c;

        for (int i = 0; i < n; i++) {
            //Obtengo caracteres entre 'A' y 'Z'
            c = (char) ('A' + i% ('Z' - 'A' + 1));

            //Concateno el caracter en eñ StringBuffer
            sb.append(c);
        }
        //Obtengo el milisegundo actual
        long hf = System.currentTimeMillis();

        //Muestro la cadena resultante
        System.out.println(sb.toString());

        //Muestro la cantidad de milisegundos consumidos
        System.out.println(hf - hi + " milisegundos");
    }
}
