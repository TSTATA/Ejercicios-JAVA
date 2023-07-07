
package ejercicios.ejerciciotres.ejercicioTres;
public class ejercicioTres {
    public static void main(String[] args) {
        int v1= 7, v2 = 5, vMax =0;
        if (v1 > v2) {
            vMax = v1;
        } else if (v1 == v2) {
            System.out.println("Son iguales.");
        } else
            vMax = v2;
           // al no poner {} ejecuta solo la ´linea (vMax = v2;) lo que venga despues está fuera del else.

        //System.out.println("El numero mayor entre  %d y %d es %d ", v1,v2,vMax); // ERROR no se hace así
        // formato cadena es asi :
        String s1 = String.format("El numero mayor entre v1: %d y v2: %d es vMax: %d ", v1,v2,vMax);
        System.out.println(s1);

        // block statements and variable Scope
        if (v2>0){
            System.out.println(v1);
            System.out.println(v2);
            float avg = (float)v1/(float)v2;
            //System.out.println(avg); // 1.4
        }
        // System.out.println(avg); // Error. cuando sale del bloque avg ya no existe. sol : declararlo antes

        // Operadores lógicos.
        int a =20, b=14, c=15;
        if (a>b & b>c)
            System.out.println("a es mayor que c "); // es un and tienen que cumplirse los dos
        else
            System.out.println("compara a con c ");
        if (a>b | b>c)
            System.out.println("se ha complido al menos una de las condiciones "); // es un or
        else
            System.out.println("no se ha cumplido ninguna ");
        if (a>b ^ b>c)
            System.out.println("se ha cumplido estríctamente solo una de las dos condiciones "); // puerta xor (01 10)
        else
            System.out.println("00 o 11 ");
        boolean booleanVal = false;
        if (!booleanVal) // not false = true, se cumple la condicion
            System.out.println("se cumple la condicion ");
        else
            System.out.println(" no se cumple");

        // Conditional Logical Operators
        int d =150, e=0;
        // if (e>0 & d/e > 30) // evalua las dos condiciones sin tener en cuenta la primera. Error compilacion 150/0
        if (e>0 && d/e > 30) // evalua la primera, es falsa, no sigue.
            System.out.println(" Se cumple");
        else
            System.out.println(" No se cumple");
    }
}
