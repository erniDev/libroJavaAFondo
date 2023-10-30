package libroCap02.fechas;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f = null;
        f = new Fecha();
        f.setAnio(1970);
        f.setDia(2);
        f.setMes(10);

        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Anio = " + f.getAnio());

        System.out.println(f);

        Fecha fe = new Fecha();
        fe.setAnio(1970);
        fe.setDia(3);
        fe.setMes(10);

        System.out.println("Dia = " + fe.getDia());
        System.out.println("Mes = " + fe.getMes());
        System.out.println("Anio = " + fe.getAnio());

        System.out.println(fe);

        if (fe.equals(f)){
            System.out.println("1");
        }else {
            System.out.println("2");
        }


    }
}
