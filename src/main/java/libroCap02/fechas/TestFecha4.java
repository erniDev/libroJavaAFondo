package libroCap02.fechas;

import java.util.Scanner;

public class TestFecha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresa la fecha
        System.out.println("Ingrese una fecha (dd/mm/aaaa): ");

        // Leo la fecha (Cadena de caracteres) ingresado
        String sFecha = sc.next();

        // Crea un objeto de la clase fecha
        Fecha f = new Fecha();

        f.setsFecha(sFecha);

        // La muestro
        System.out.println("La fecha que ingreso es: " + f.getsFecha());

        // El usuario ingresa la suma de los dias a sumar
        System.out.println("Ingrese los dias que quiere sumar (Puede ser negativo): ");
        int diasSum = sc.nextInt();

        // Le sumo los dias a la fecha

            f.addDias(diasSum);
            System.out.println(f);


        // Muestro la nueva fecha (con los dias sumados)
        System.out.println("Sumando " + diasSum + " dias, queda " + f);

    }
}
