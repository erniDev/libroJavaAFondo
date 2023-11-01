package libroCap02.figuras;
/**
 * Clase en la cual vamos a calculaar el area de un rectangulo
 *
 * Utilizamos @Override para sobreescribir un metodo abtracto
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.2 01/11/2023
 */
public class Rectangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Calculamos el area de un rectangulo
     *
     * @return Retorna el area de un rectangulo
     * */
    @Override
    public double area() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
