package libroCap01;
/**
 * Clase pide al usuario que digite un numero y muestra en pantalla si es par o impar
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        // Opcion 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese in numero");
        int numero =  sc.nextInt();

        if ( (numero % 2) == 0 ){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

        //Opcion 2 utilizamos un if in-line

        String mssg = ((numero % 2) == 0) ? "Es par" : "ES impar";
        System.out.println(mssg);

    }
}
