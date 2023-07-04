public class EJ02b_Stringformating {
    public static void main(String [] args){
        int iVal = 32;
        int a =1, b=2, c=3, d=4;
        String s1 = String.format("s1 valor decimal %d", iVal); // indica que quiero imp en formato decimal.
        System.out.println(s1);
        String s2 = String.format("s2 valor hexadecimal %x", iVal); // da 20
        System.out.println(s2);
        String s3 = String.format("s3 evitando confusion %#x", iVal); // da 0x20 es el formato tradicional para numeros exadecimales.
        System.out.println(s3);
        // a parte de # hay : 0 and -
        String s4 = String.format("s4 A  %d B %d", a,b);
        System.out.println(s4);
        String s5 = String.format("s5 A %4d, B %4d", a,b);
        System.out.println(s5);
        String s6 = String.format("s6 A %04d, B %04d", a,b);
        System.out.println(s6);
        // el menos es para jusfiticar a la izquierda :
        String s7 = String.format("s7 A %-4d, B %-4d", a,b);
        System.out.println(s7);
        int numero = 12345678;
        double numeroDos = 12345678.0d;
        String s8 = String.format("s8 numero con comas : %,d ", numero);
        System.out.println(s8);
        String s9 = String.format("s9 numero con comas : %,.2f ", numeroDos);
        System.out.println(s9);
        // SPACE : LEADING SPACE WHEN POSITIVE NUMBER.
        // +     : ALWAYS SHOW SIGN
        // (     : Enclose negative values in parenthesis : sol : 123 (456)
         int numNeg = -456, numPos = 123;
         String s10 = String.format("s10 numero neg : %d ", numNeg );
         System.out.println(s10);
         String s11 = String.format("s11 numero pos : %d ", numPos );
         System.out.println(s11);
         // queremos que las cifras estén a la misma altura (SPACE)
         String s12 = String.format("s12 numero neg : % d ", numNeg );
         System.out.println(s12);
         String s13 = String.format("s13 numero pos : % d ", numPos );
         System.out.println(s13);
         // queremos ver siempre el signo :
         String s14 = String.format("s14 numero neg : %+d ", numNeg );
         System.out.println(s14);
         String s15 = String.format("s15 numero pos : %+d ", numPos );
         System.out.println(s15);
        // displays
        // s1 valor decimal 32
        // s2 valor hexadecimal 20
        // s3 evitando confusion 0x20
        // s4 A  1 B 2
        // s5 A    1, B    2
        // s6 A 0001, B 0002
        // s7 A 1   , B 2
        // s8 numero con comas : 12.345.678
        // s9 numero con comas : 12.345.678,00
        // s10 numero neg : -456
        // s11 numero pos : 123
        // s12 numero neg : -456
        // s13 numero pos :  123
        // s14 numero neg : -456
        // s15 numero pos : +123
    }
}