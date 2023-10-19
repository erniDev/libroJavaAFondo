package libroCap01;

import java.util.Scanner;
import java.util.jar.JarEntry;
/**
 * Clase le pide al usuario llenar un array de 10 y luego lo imprime
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class DemoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[10];

        int num, j = 0;

        do {
            System.out.println("Ingrese un valor (0 => fin): ");
            num= sc.nextInt();
            arr [j] = num;
            j++;
        }while (j > 0 && j != 10);

        for (int i = 0; i < j ; i++) {
            System.out.println(arr[i]);
        }

    }
}
