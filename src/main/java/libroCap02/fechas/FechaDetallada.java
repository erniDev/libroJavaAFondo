package libroCap02.fechas;
/**
 * Clase es un ejemplo de herencia y de polimorfismo y sobre escribimos el metodo toString
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.1 30/10/2023
 */
public class FechaDetallada extends Fecha{
    private static String meses [] = {
            "          Enero"
                    , "Febrero"
                    , "Marzo"
                    , "Abril"
                    , "Mayo"
                    , "Junio"
                    , "Julio"
                    , "Agosto"
                    , "Septiembre"
                    , "Octubre"
                    , "Noviembre"
                    , "Diciembre"};

    public FechaDetallada() {
    }

    public FechaDetallada(String f) {
        super(f);
    }

    public FechaDetallada(int dia, int mes, int anio) {
        super(dia, mes, anio);
    }

    public String toString(){
        return getDia() + " de " + meses[getMes()-1] + " del " + getAnio();
    }
}
