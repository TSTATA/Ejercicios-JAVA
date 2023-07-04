public class EJ02_Stringformating {
    public static void main(String [] args){
        // CONCATENATION VS FORMATTING
        int david =17, maria = 15, juan =6;
        StringBuilder s1 = new StringBuilder();
        s1.append ("                 mis sobrinos tienen ");
        s1.append (david);
        s1.append (", ");
        s1.append (maria);
        s1.append (",  ");
        s1.append (juan);
        s1.append (" anos");
        String message = s1.toString();
        System.out.println(message);
        // otra forma
        System.out.println("otra forma :     mis sobrinos tienen " + david + ", " + maria + ", " + juan + " anos");
        // formato cadena
         String s2 = String.format("formato cadena : mis sobrinos tienen %d, %d, %d anos", david, maria, juan);
         System.out.println(s2);
         // la media da 12.66666666666666666666666666
         double media = (david + maria + juan)/3.0;
         System.out.println(media); // TSTATA porque me da 12 ??? sol : porque estaba dividiendo entre 3 y no 3.0
         String s3 = String.format("media es %.1f ", media);
         System.out.println(s3);
    }
}