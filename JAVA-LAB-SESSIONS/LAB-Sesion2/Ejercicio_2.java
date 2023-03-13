// introducir datos
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio_2{
 public static void main(String args[]){
  double longitud, area, radio;
  Scanner entrada = new Scanner(System.in);
  entrada.useLocale(Locale.US);
  System.out.print("introduce el radio ");
  radio=entrada.nextDouble();
  longitud= 2*3.14159*radio;
  area= 3.14159*(radio*radio);
  System.out.println("dado que el radio es "+radio);
  System.out.println("la longitud es "+longitud);
  System.out.println("el area es "+area);
 }
}