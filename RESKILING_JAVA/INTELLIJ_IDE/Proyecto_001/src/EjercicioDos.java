package ejercicios.ejercicioDos.EjercicioDos;
public class EjercicioDos {
    public static void main(String[] args) {
        /*
        Integer types : byte 8 short 16 int 32 long 64
        Floating point types  : float 32 double 64 bits
        character and boolean types :
        char regurlar 'u';
        boolean x = true;

        4. Type conversion
           conversiones ampliadas y conversiones de estrechamientos.
        conversión explicita de flotante a entero
         */
        int A = 50;
        long B = A;

        long C = 50;
        int D = (int) C;

        float floatVal = 1.6f;
        double doubleVal = 4.4d;
        byte byteVal =7;
        short shortVal = 6;
        long longVal = 5;
        // short result1= byteVal; // success
        // short result1= longVal;  // ERROR
        // short result1= (short) longVal;  // success
        // short result1= (short) (byteVal - longVal); // success
        // long result1= (longVal - floatVal); // ERROR
        // float result1= (longVal - floatVal); // success
        // float result1= (longVal - doubleVal); // ERROR
        // double result1= (longVal - doubleVal); // success (0.5999999999999996 ?)
        long result1= (long)(shortVal - longVal + floatVal + doubleVal); // success 6-5 + 1.6 + 4.4 =6
        System.out.println(result1);
        System.out.println("success");


    }
}
