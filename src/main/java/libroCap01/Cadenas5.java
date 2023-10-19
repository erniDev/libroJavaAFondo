package libroCap01;
/**
 * Clase muestra con indexOf() la posicion de un valor y muestra con lastIndexOf() la posicion de la ultima vez
 * que se encuentra el valor dado
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class Cadenas5 {
    public static void main(String[] args) {
        String s = "Un buen libro de java, un buen material";

        int pos1 = s.indexOf("buen");
        int pos2 = s.lastIndexOf("buen");

        System.out.println(pos1);
        System.out.println(pos2);
    }
}
