public class EJ03_StringBuilder {
    public static void main(String [] args){
        String cuidad = "Madrid";
        int numeroVuelo = 175;
        StringBuilder sb = new StringBuilder(40);
        // la clase stringbuilder puede cambiar su tamaño dinámicamente.
        // StringBuilder tendrá un bufer que administrará. metemos los datos que queremos en ese bufer :
        sb.append(" vole a ");
        sb.append(cuidad);
        sb.append(" en el vuelo : ");
        sb.append(numeroVuelo);
        String message = sb.toString();
        System.out.println(message);
        // Ejercicio 2
        /*  esta info quiero ponerla en algun lugar en el medio del valor existente. identificamos en que parte del buffer.
        ponemos la infor de tiempo donde " en el vuelo" existe en el buffer."*/
         String tiempo = "9:00";
       // index da la posicion :
          int pos = sb.indexOf(" vuelo");
       // llamo la posicion e inserto :
         sb.insert(pos, " a las ");
       // otro insert indicando que quiero estar 7 caracteres mas abajo
         sb.insert(pos + 7 , tiempo);
         String messageDos = sb.toString();
         System.out.println(messageDos);

    }
}