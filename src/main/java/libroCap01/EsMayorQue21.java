package libroCap01;

import java.util.Scanner;

public class EsMayorQue21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad <= 21){
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("Usted es menor de edad");
        }
    }
}
