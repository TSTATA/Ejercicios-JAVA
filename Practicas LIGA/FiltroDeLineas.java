import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiltroDeLineas {

    public static void main(String[] args) {
        // Nombre del archivo de entrada y salida
        String archivoEntrada = "Actividad_liga_principal.txt";
        String archivoSalida = "Actividad_liga_filtrado.txt";

        // Nombres a buscar al inicio de las líneas
        String[] nombres = { "Amin_RM", "dimaH", "bo3lam", "Dreamteam", "ImadTB" };

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                // Verifica si la línea comienza con alguno de los nombres
                boolean comienzaConNombre = false;
                for (String nombre : nombres) {
                    if (linea.startsWith(nombre)) {
                        comienzaConNombre = true;
                        break;
                    }
                }

                // Si comienza con uno de los nombres, escríbela en el archivo de salida
                if (comienzaConNombre) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            System.out.println("Archivo filtrado creado con éxito.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
