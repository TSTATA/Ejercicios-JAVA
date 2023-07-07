package ejercicios.uno.calculadora;
public class CalcEngine {
    public static void main(String[] args) {
        //double val1=30, val2=5, result=0;
        //char opCode = 'a';
        // otra forma
        double[] izqVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double [] derVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double [opCodes.length]; // lo configuro con un tamaño fijo de 4 = que opCodes.
        for ( int i =0; i < opCodes.length; i++){
             if (opCodes[i] == 'a')
                 results[i] = izqVals[i] + derVals[i];
             else if (opCodes[i] == 's')
                 results[i] = izqVals[i] - derVals[i];
             else if (opCodes[i] == 'd')
                 results[i] = izqVals[i] / derVals[i];
             else if (opCodes[i] == 'm')
                 results[i] = izqVals[i] * derVals[i];
             // System.out.println(results[i]);
        }
        for (double theResult : results) {
            System.out.print ("result = ");
            System.out.println (theResult);
        }

        // if (opCode == 'a')
        //     result = val1 + val2;
        // else if (opCode == 's')
        //     result = val1 - val2;
        // else if (opCode == 'd')
        //     result = val1 / val2;
        // else if (opCode == 'm')
        //     result = val1 * val2;
        // System.out.println(result);

    }
}