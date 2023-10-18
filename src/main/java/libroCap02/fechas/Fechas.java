package libroCap02.fechas;
    /*
        Permite leer una fecha de forma de una cadena de String y convertirlo a 3 variables como
        anio, mes, dia
    */
public class Fechas {
        private int dia;
        private int mes;
        private int amio;

        public void fecha (String s){
            // Imprima la primera ocurrencia de '/'
            int pos1 =  s.indexOf('/');

            // Imprima la ultima ocurrencia de '/'
            int pos2 = s.lastIndexOf('/');

            //Proceso el dia
            String sDia = s.substring(0,pos1);
            dia = Integer.parseInt(sDia);

            // Proceso el mes
            String sMes = s.substring(pos1 + 1,pos2);
            mes = Integer.parseInt(sMes);

            //Proceso del anio
            String sAnio = s.substring(pos2 + 1);
            amio = Integer.parseInt(sAnio);
        }

}
