package libroCap02.fechas;
/**
 * Clase que permite acceder a los ejemplos de la clase FechaDetallada
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.1 30/10/2023
 */
public class TestFechaDetallada {
    public static void main(String[] args) {

        FechaDetallada fecha = new FechaDetallada();
        fecha.setDia(25);
        fecha.setMes(10);
        fecha.setAnio(2009);
        System.out.println(fecha);
    }

}
