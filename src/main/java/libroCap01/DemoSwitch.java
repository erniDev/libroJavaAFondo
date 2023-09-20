package libroCap01;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de la semana (numeros de 1 al 7)");
        int num = sc.nextInt();
        String dia = null;
        //Opcion 1
        switch (num){
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miercoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sabado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.println("error numero incorecto");
                break;
        }
        System.out.println(dia);

        /*Opcion 2
        Para Java 14
        switch (num){
            case 1 -> dia = "Lunes" ;
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miercoles";
            case 4 -> dia = "Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sabado";
            case 7 -> dia = "Domingo";
        }*/
        System.out.println(dia);
    }
}
