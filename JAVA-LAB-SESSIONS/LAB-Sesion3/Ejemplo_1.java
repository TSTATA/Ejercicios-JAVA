/**El siguiente ejemplo muestra una clase con un método auxiliar que permite escribir el mensaje Eco… tantas veces como le indiquemos.
*/
import java.util.Scanner;

public class Ejemplo_1{
 public static void main(String[] args){
  Scanner entrada = new Scanner(System.in);
  System.out.println("introduce num..");
  int numero = entrada.nextInt();
  System.out.println("ok ...");
  mifuncion(numero); //llamada a la funcion.
 }
 public static void mifuncion(int veces){
  for (int i=0; i<veces; i++){
   System.out.println("Eco ...");
  }
 }
}