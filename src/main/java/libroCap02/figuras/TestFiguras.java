package libroCap02.figuras;
/**
 * Clase que prueba las clases de la carpeta figuras
 *
 * @author Erick Nicolas Gonzalez Rojas
 * @version 1.2 01/11/2023
 */
public class TestFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        Rectangulo rectangulo = new Rectangulo(10,5);
        Triangulo triangulo = new Triangulo(3,6);

        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(triangulo);

    }
}
