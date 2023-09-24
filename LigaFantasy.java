import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LigaFantasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("registro_liga_fantasy.txt"));

            while (true) {
                System.out.print("Nombre del presidente (o 'fin' para salir): ");
                String nombrePresidente = scanner.nextLine();

                if (nombrePresidente.equalsIgnoreCase("fin")) {
                    break; // Salir del bucle si se ingresa "fin"
                }

                double gastos = 0;
                double ingresosPorVenta = 0;
                int puntosConseguidos = 0;

                while (true) {
                    System.out.print("¿Qué desea registrar? (gasto/ingreso/puntos/fin): ");
                    String opcion = scanner.nextLine();

                    if (opcion.equalsIgnoreCase("fin")) {
                        break; // Salir del bucle de registro
                    }

                    if (opcion.equalsIgnoreCase("gasto")) {
                        System.out.print("Gastos: ");
                        double gasto = scanner.nextDouble();
                        scanner.nextLine(); // Consumir la nueva línea pendiente
                        gastos += gasto;
                    } else if (opcion.equalsIgnoreCase("ingreso")) {
                        System.out.print("Ingresos por venta de jugadores: ");
                        double ingreso = scanner.nextDouble();
                        scanner.nextLine(); // Consumir la nueva línea pendiente
                        ingresosPorVenta += ingreso;
                    } else if (opcion.equalsIgnoreCase("puntos")) {
                        System.out.print("Puntos conseguidos por el presidente: ");
                        puntosConseguidos = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea pendiente
                    } else {
                        System.err.println("Opción no válida. Por favor, ingrese 'gasto', 'ingreso', 'puntos' o 'fin'.");
                    }
                }

                // Calcular ganancias por puntos
                double gananciasPorPuntos = puntosConseguidos * 100000;

                // Calcular el saldo total
                double saldoTotal = gananciasPorPuntos + ingresosPorVenta - gastos;

                // Escribir la información en el archivo
                writer.write("Presidente: " + nombrePresidente + "\n");
                writer.write("Gastos: " + gastos + " euros\n");
                writer.write("Ingresos por venta de jugadores: " + ingresosPorVenta + " euros\n");
                writer.write("Ganancias por puntos conseguidos: " + gananciasPorPuntos + " euros\n");
                writer.write("Saldo Total: " + saldoTotal + " euros\n");
                writer.write("\n");

                System.out.println("Registro completado para " + nombrePresidente);
            }

            writer.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
