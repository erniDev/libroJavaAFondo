package libroCap01;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        // Opcion 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese in numero");
        int numero =  sc.nextInt();

        if ( (numero % 2) == 0 ){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

        //Opcion 2 utilizamos un if in-line

        String mssg = ((numero % 2) == 0) ? "Es par" : "ES impar";
        System.out.println(mssg);

    }
}
