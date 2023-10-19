package libroCap01;

import java.util.Scanner;
/**
 * Clase crea un array de tipo estring que contenga los dias de la semana y si el numero es mayor a 7 da un error
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class DemoArray2 {
    public static void main(String[] args) {
        String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado","domingo"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana (numero): ");
        int dia = sc.nextInt();

        if (dia <= dias.length){
            System.out.println(dias[dia-1]);
        }else {
            System.out.println("El numero que escribio no esta entre 1 y 7");
        }
    }
}
