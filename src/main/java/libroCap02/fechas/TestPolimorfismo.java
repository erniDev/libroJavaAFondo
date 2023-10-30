package libroCap02.fechas;
/**
 * Clase Compara los metodos toString de las clases Fecha y el toString de la clase Object
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.1 30/10/2023
 */
public class TestPolimorfismo {
    public static void main(String[] args) {
        // A la fecha (de tipo Fecha) le asigno un objeto FechaDetallada
        Fecha fech = new FechaDetallada(25, 10, 2009 );

        // A la fecha (de tipo Object) le asigno un objeto FechaDetallada
        Object ob = new FechaDetallada(3,12,2006);

        //Impreimo los 2 objetos
        System.out.println("Objec = " +ob);
        System.out.println("FechaDetallada = " + fech);
    }
}
