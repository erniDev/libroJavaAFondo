package libroCap01;

import java.util.Scanner;

public class DemoConstantes {

    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO =7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de la semana (numeros de 1 al 7)");
        int num = sc.nextInt();

        String dia = null;
        //Opcion 1
        switch (num){
            case LUNES:
                dia = "lunes";
                break;
            case MARTES:
                dia = "martes";
                break;
            case MIERCOLES:
                dia = "miercoles";
                break;
            case JUEVES:
                dia = "jueves";
                break;
            case VIERNES:
                dia = "viernes";
                break;
            case SABADO:
                dia = "sabado";
                break;
            case DOMINGO:
                dia = "domingo";
                break;
            default:
                System.out.println("error numero incorecto");
                break;
        }
        System.out.println(dia);
    }

}
