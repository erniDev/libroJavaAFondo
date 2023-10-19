package libroCap01;

import java.util.Scanner;
/**
 * Clase con:
 *      Integer.toBinaryString() -> numero entero a binario
 *      Integer.toOctalString()  -> numero entero a octal
 *      Integer.toHexString()    -> munero entero a hexadecimal
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class Cadenas6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor entero");
        int v = sc.nextInt();

        System.out.println("Valor ingresao: " + v);
        System.out.println("Binario = " + Integer.toBinaryString(v));
        System.out.println("Octal = " +Integer.toOctalString(v));
        System.out.println("Hexadecimal = " +Integer.toHexString(v));

        System.out.println("Ingrese una base numerica: ");
        int b = sc.nextInt();

        String sBaseN = Integer.toString(v,b);
        System.out.println(v + " en base ("+ b +") = " + sBaseN);
    }
}
