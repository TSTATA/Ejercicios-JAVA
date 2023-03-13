// introducir datos
import java.util.Scanner;
import java.util.Locale;
public class Ejercicio_1{
 public static void main(String args[]){
 Scanner entrada = new Scanner(System.in);
 entrada.useLocale(Locale.US);
 double x=0;
 int redondeo=0;
 int redondeo_2=0;
 System.out.print("indroduce el numero ");
 x = entrada.nextDouble();
 redondeo = (int) (2*x) - (int) (x);
 redondeo_2= (int) (x+0.5);
 System.out.println("el numero es "+x+" el redondeo es "+redondeo);
 System.out.println("el numero es "+x+" el redondeo_2 es "+redondeo_2);
 }
}