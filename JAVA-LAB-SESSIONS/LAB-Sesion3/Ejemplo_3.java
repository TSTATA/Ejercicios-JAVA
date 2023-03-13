import java.util.Scanner;

public class Ejemplo_3{
	public static void main(String args[]){
		int num_1=0,num_2=0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("introduce primer numero: ");
		num_1 = entrada.nextInt();
		System.out.print("introduce segundo numero: ");
		num_2 = entrada.nextInt();
		calcula(num_1,num_2);
		System.out.println("Resultado: "+calcula(num_1,num_2));
	}
	public static int calcula (int x, int y){
		int num_1=100, num_2=10, resultado=0;
		resultado = num_1*x + num_2*y;
		return resultado;
	}
}