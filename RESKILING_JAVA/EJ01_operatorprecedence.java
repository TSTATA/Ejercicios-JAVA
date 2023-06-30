public class EJ01_operatorprecedence {
  public static void main(String[] args ) {
    int valA = 21;
    int valB = 9;
    int valC = 3;
    int valD = 1;

    float a = 1.0f;
    double b = 4.0d;
    byte c =7;
    short d = 7;
    long e = 5;

    int result1 = valA - valB /valC;
    int result2 = (valA - valB) /valC;
    short result3 = c;
    // short result4 = e;   no se puede convertir long en short
    short result4 = (short) e;
    // short result5 = c - e; cuando mezclamos dos enteros el grande es el que se usa. error de conversion
    short result5 = (short)(c - e);
    System.out.println(result1);
    System.out.println(result2);
  }
}
