import java.util.Scanner;

public class Ejemplo_2{
	static String global= "global";	//variable global a la clase
	
	public static void main(String args[]) {
		int num = 1;			//por valor
		int numeros[] = {1,2,3,4,5};	//los arrays se pasan por referencia
		String cadena = "abc_cuidado";		//por valor
		System.out.println("**************************************************************************");
		System.out.println("********************************SIN LLAMAR********************************");
		System.out.println("**************************************************************************");		
		System.out.println("\nnum: "+num);	
		System.out.println("\nArray : ");
		for (int i=0; i<5; i++) {
			System.out.print(" "+numeros[i]);
		}	
		System.out.println("\nCadena : "+cadena);	
		System.out.println("Global : "+global);
		
		System.out.println("**************************************************************************");
		System.out.println("********************************llamamos al metodo************************");
		System.out.println("**************************************************************************");		
		//llamamos al método
		convierte(num, numeros, cadena);						
		
		System.out.println("\nNúmero : "+num);	
		System.out.println("\nArray : ");	
		for (int i=0; i<5; i++) {
			System.out.print(" "+numeros[i]);
		}
		System.out.println("\nCadena : "+cadena);	
		System.out.println("Global : "+global);
	}
	
	public static void convierte(int num, int numeros[], String cadena) {
		num += 1;
		//sumamos 1 al array de enteros
		for (int i=0; i<5; i++) {
			numeros[i] += 1;
		}		
		cadena = "def";		
		global = "nueva";
	}
}
