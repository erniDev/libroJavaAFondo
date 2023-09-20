package libroCap01;

import java.util.Scanner;

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
