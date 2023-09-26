package libroCap01;

import java.util.Scanner;

public class Cadenas8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String s1 = sc.next();

        System.out.println("Ingrese otra cadena");
        String s2 = sc.next();

        // Muestra las cadenas para verificar lo que contienen
        System.out.println("s1 = [" + s1 + "]");
        System.out.println("s2 = [" + s2 + "]");

        //Esto esta mal
        if (s1 == s2){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }

        //Asi es
        if (s1.equals(s2)){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}
