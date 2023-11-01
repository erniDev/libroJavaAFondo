package libroCap02.figuras;
/**
 * Clase en la cual vamos a calculaar el area de un Circulo
 *
 * Utilizamos @Override para sobreescribir un metodo abtracto
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.2 01/11/2023
 */
public class Circulo extends FigurasGeometricas{
    private int radio;
    public Circulo (int r){
        this.radio = r;
    }
    /**
     * Calculamos el area de un circulo
     *
     * @return Retorna el area de un circulo
     * */
    @Override
    public double area(){
        //Retorno "Pi por radio al cuadrado"
        return Math.PI * Math.pow(radio,2);
    }
}
