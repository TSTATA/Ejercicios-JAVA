import java.util.Scanner;

public class GestionClausulas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // while (true) : crea un bucle infinito  hasta que encuentre instruccion de break
            System.out.println("Que quieres hacer");
            System.out.println("1. Comprar/Calusulazo");
            System.out.println("2. Subir mi clausula");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de linea

            if (opcion == 1) {
                System.out.print("Nombre del jugador: ");
                String nombre = scanner.nextLine();
                System.out.print("Valor de mercado: ");
                double valorMercado = scanner.nextDouble();
                System.out.print("Porcentaje de crecimiento en los ultimos 5 dias: ");
                double crecimientoPorcentaje = scanner.nextDouble();
                double crecimientoPorDia = (valorMercado * crecimientoPorcentaje) / 100 / 5;

                System.out.println("Crecimiento diario en euros: " + crecimientoPorDia);
                double valorRecomendado = valorMercado + (crecimientoPorDia * 8);
                System.out.println("Valor recomendado para comprar: " + valorRecomendado);
            } else if (opcion == 2) {
                System.out.print("Nombre del jugador: ");
                String nombre = scanner.nextLine();
                System.out.print("Valor de mercado: ");
                double valorMercado = scanner.nextDouble();
                System.out.print("Porcentaje de crecimiento en los ultimos 5 dias: ");
                double crecimientoPorcentaje = scanner.nextDouble();
                double crecimientoPorDia = (valorMercado * crecimientoPorcentaje) / 100 / 5;

                System.out.println("Crecimiento diario en euros: " + crecimientoPorDia);
                double subirClausula = crecimientoPorDia * 20;
                double costoBolsillo = crecimientoPorDia * 10;
                System.out.println("Recomendacion para subir la clausula: " + subirClausula);
                System.out.println("Costo de tu bolsillo: " + costoBolsillo);
            } else if (opcion == 3) {
                break; // Salir del programa
            } else {
                System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
            }
        }

        scanner.close();
    }
}
