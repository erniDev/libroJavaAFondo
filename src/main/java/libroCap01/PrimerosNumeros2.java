package libroCap01;

import java.util.Scanner;
/**
 * Clase con un ciclo do while imprime los numeros que el usuario digite
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class PrimerosNumeros2 {
    public static void main(String[] args) {
        int i = 1;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        num = sc.nextInt();

        do {
            System.out.println(i);
            i++;
        } while (i <= num);

    }
}
