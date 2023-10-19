package libroCap01;
 /**
  * Clase muestra mediante startWith() si una cadena de caracteres empieza con unos valores dados
  * ymediante endWith() si una cadena de caracteres termina con unos valores dados
  *
  * Con los metodos startWith y endWith, podemos verificar muy facil mente si una cadena
  * comienza con determinado prefijo o termina con algun sufijo.
  *
  * @author Erick Nicolas Gonzalez Rojas
  * @version 1.0 19/10/2023
 */
public class Cadenas4 {
    public static void main(String[] args) {
        String s = "Un buen libro de Java";

        boolean b1 = s.startsWith("Un buen");
        boolean b2 = s.startsWith("A");
        boolean b3 = s.endsWith("Java");
        boolean b4 = s.endsWith("Cahu");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
