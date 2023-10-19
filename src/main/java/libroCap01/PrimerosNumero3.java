package libroCap01;

import java.util.Scanner;
/**
 * Clase pide al usuario que digite un numero y muestra en pantalla los numeros del
 * 1 hasta el numero que digito
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class PrimerosNumero3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            System.out.println(i);
        }

    }
}
