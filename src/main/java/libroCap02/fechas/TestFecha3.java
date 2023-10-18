package libroCap02.fechas;

import java.util.Scanner;

public class TestFecha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha (dia, mes y anio): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        Fecha f1 = new Fecha(dia,mes,anio);

        System.out.println("Ingrese la segunda fecha (dia, mes y anio): ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();
        Fecha f2 = new Fecha(dia,mes,anio);

        System.out.println("Primera fecha : "+ f1);
        System.out.println("Segunda fecha : "+ f2);

        if (f1.equals(f2)){
            System.out.println("las 2 fechas son iguales: " + f1);
        }else {
            System.out.println("Las 2 fechas son diferentes");
            System.out.println(f1);
            System.out.println(f2);
        }

    }
}
