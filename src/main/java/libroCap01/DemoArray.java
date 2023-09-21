package libroCap01;

import java.util.Scanner;
import java.util.jar.JarEntry;

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
