package libroCap01;

import java.util.Scanner;
/**
 * Clase pide que el usuario digite la cantidad de filas y de columnas y imprime una matriz random
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.0 19/10/2023
 */
public class DemoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de posiciones de la fila");
        int n = sc.nextInt();

        System.out.println("Digite la cantidad de posiciones de la columna");
        int m = sc.nextInt();

        int matriz [][] =  new int[n][m];

        int num;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                num = (int) (Math.random() * 1000);
                matriz [i][j] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
