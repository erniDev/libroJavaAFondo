package libroCap02.fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    //Sobreescribimos el metodo toString (lo heredamos de object)
    public String toString (){
        // Retprna la fecha tal como queremos que se vea la fecha
        return dia + "/" + mes + "/" + anio;
    }

    //Sobreescribimos el metodo equals que heredamos de la clase object
    public boolean equals (Object o){
        Fecha otra =(Fecha) o;
        return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
