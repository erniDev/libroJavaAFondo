package libroCap01;

import java.util.Scanner;

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
