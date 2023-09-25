package libroCap01;

public class Cadenas2 {
    public static void main(String[] args) {
        String s = "Esto Es Una Cadena de caracteres";

        int pos1 = s.indexOf('C');
        int pos2 = s.lastIndexOf('C');
        int pos3 = s.indexOf('x'); // Si no se encuentra el caracter en la cadena el valor es negativo

        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
