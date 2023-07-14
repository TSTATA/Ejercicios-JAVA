package ejercicios.Ej01_leerficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheros {
    // repasar curso 3.10 
        public static void main(String[] args) {
            BufferedReader br = null;
            FileReader fr = null;

            try { //  Se inicia un bloque try para manejar las posibles excepciones que puedan ocurrir durante la lectura del archivo.
                // Especifica la ruta del archivo que deseas leer
                String rutaArchivo = "C:\\Users\\atayebi\\Ejercicios JAVA\\RESKILING_JAVA\\INTELLIJ_IDE\\Proyecto_003\\src\\ejercicios\\Ej01_leerficheros\\FiecheroDeTexto.txt";

                fr = new FileReader(rutaArchivo); // Esto abre el archivo para su lectura
                br = new BufferedReader(fr); // Se utiliza para leer el archivo línea por línea.

                String linea;
                while ((linea = br.readLine()) != null) { // lee una línea del archivo y la asigna a la variable linea. Si la línea leida no es null el bucle se ejecuta.
                    // Procesa cada línea del archivo
                    System.out.println(linea);
                }
            } catch (IOException e) { // Si ocurre alguna excepción durante la lectura del archivo, se captura en el bloque catch. En este caso, se imprime la traza de la excepción.
                e.printStackTrace();
                // Después del bloque try-catch, se ejecuta el bloque finally, que garantiza que los recursos sean liberados correctamente, incluso si ocurren excepciones.
            } finally {
                try {
                    // Cierra los recursos
                    if (br != null)
                        br.close();
                    if (fr != null)
                        fr.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

