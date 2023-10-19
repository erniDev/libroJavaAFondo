package libroCap02.fechas;

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

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
    }
// Esta mal diseñado el programa del libro

    /*
      Permite leer una fecha de forma de una cadena de String y convertirlo a 3 variables como
      anio, mes, dia
  */
    private String sFecha;

    public String getsFecha() {
        return sFecha;
    }

    public void setsFecha(String sFecha) {
        this.sFecha = sFecha;
    }

    public void fecha (String s){
        s = sFecha;

        // Busca la primera ocurrencia de '/'
        int pos1 =  s.indexOf('/');

        // Busca la ultima ocurrencia de '/'
        int pos2 = s.lastIndexOf('/');

        //Proceso el dia
        String sDia = s.substring(0,pos1);
        dia = Integer.parseInt(sDia);

        // Proceso el mes
        String sMes = s.substring(pos1 + 1,pos2);
        mes = Integer.parseInt(sMes);

        //Proceso del anio
        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);

        System.out.println(dia);
        System.out.println(mes);
        System.out.println(anio);
        fechaToDias();

    }
    /*
    *
    */
    private int fechaToDias() {
        int fe = anio * 360 + mes * 30 + dia;
        return fe ;
    }

    /*
        asigna la fecha expresada en dias a los atributos
    */
    private String diasToFecha (int i){
         // Dividimos en en 360 para tener el anio
        System.out.println("4566666666666");

        System.out.println(i);
        anio = (int) i / 360;

         // Del resto de la division anterior obtenemos el mes y el dia
         int resto = i % 360;
         mes = (int) resto / 30;

         // Del resto de la division anterior obtenemos el dia
         dia = resto % 30;

         /*
            Ajuste porsi el dia quedo en 0
         */

         if (dia == 0){
             dia = 30;
             mes --;
         }
         /*
            Ajuste por si el mes quedo en 0
         */
         if(mes == 0){
             mes = 12;
             anio --;
         }
         String fecha1;
         return fecha1 = dia + "/" + mes + "/" + anio;
    }
    public void addDias (int d){
        // Convierto la fecha a dias y le sumo a d
        fecha(sFecha);
        int sum = fechaToDias() + d;

        // La fecha resultante (sum) la separo en dia, mes y anio
        diasToFecha(sum);

    }

}
