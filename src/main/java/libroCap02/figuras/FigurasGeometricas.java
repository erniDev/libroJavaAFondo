package libroCap02.figuras;
/**
 * Clase ejemplo de una clase abtracta con un unico metodo area
 *
 * Por definicion una clase abtracta no se puede instanciar
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.2 01/11/2023
 */
public abstract class FigurasGeometricas {
    //Metodo abstracto
    public abstract double area();

    public String toString(){
        return "area = " + area();
    }
}
