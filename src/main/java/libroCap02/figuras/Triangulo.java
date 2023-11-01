package libroCap02.figuras;
/**
 * Clase en la cual vamos a calculaar el area de un Triangulo
 *
 * Utilizamos @Override para sobreescribir un metodo abtracto
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.2 01/11/2023
 */
public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Calculamos el area de un Triangulo
     *
     * @return Retorna el area de un Triengulo
     * */
    @Override
    public double area() {
        return base * altura / 2;
    }
}
