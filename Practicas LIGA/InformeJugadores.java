import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InformeJugadores {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("informe.txt"));

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Ingrese el nombre del jugador (o escriba 'salir' para finalizar):");
                String nombre = scanner.nextLine();

                if (nombre.equalsIgnoreCase("salir")) {
                    break;
                }

                System.out.println("Ingrese el valor de mercado del jugador:");
                double valorMercado = Double.parseDouble(scanner.nextLine());

                System.out.println("Ingrese el crecimiento de los últimos 5 días (en porcentaje):");
                double crecimiento5Dias = Double.parseDouble(scanner.nextLine());

                double crecimientoDiario = crecimiento5Dias / 5 / 100; // Convertir el porcentaje a fracción
                double crecimiento8Dias = valorMercado + (valorMercado * crecimientoDiario * 8);
                double crecimiento10Dias = valorMercado + (valorMercado * crecimientoDiario * 10);
                double crecimiento13Dias = valorMercado + (valorMercado * crecimientoDiario * 13);
                double gastoClausula = valorMercado * crecimientoDiario * 13;

                writer.write("Nombre del jugador: " + nombre + "\n");
                writer.write("Valor de mercado: " + valorMercado + "\n");
                writer.write("Crecimiento en 5 días (en porcentaje): " + crecimiento5Dias + "%\n");
                writer.write("Crecimiento diario (en porcentaje): " + (crecimiento5Dias / 5) + "%\n");
                writer.write("Crecimiento en 8 días: " + crecimiento8Dias + "\n");
                writer.write("Crecimiento en 10 días: " + crecimiento10Dias + "\n");
                writer.write("Crecimiento en 13 días: " + crecimiento13Dias + "\n");
                writer.write("Gasto en cláusula (en euros): " + gastoClausula + "\n\n");
            }

            writer.close();
            scanner.close();

            System.out.println("Informe generado con éxito en 'informe.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
