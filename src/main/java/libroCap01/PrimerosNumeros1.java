package libroCap01;

import java.util.Scanner;
/**
 * Clase pide que digite un numero y impreime los numeros de 1 al valor que digito el usuario
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class PrimerosNumeros1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        int i = 1, num = sc.nextInt();

        while (i <= num){
            System.out.println(i);
            i++;
        }

    }
}
