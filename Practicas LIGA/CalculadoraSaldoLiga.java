import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculadoraSaldoLiga {

    public static void main(String[] args) {
        Map<String, Long> saldosEquipos = new HashMap<>();
        saldosEquipos.put("Amin_RM", 100_000_000L);
        saldosEquipos.put("ImadTB", 100_000_000L);
        saldosEquipos.put("dimaH", 100_000_000L);
        saldosEquipos.put("bo3lam", 100_000_000L);
        saldosEquipos.put("Dreamteam", 100_000_000L);

        try {
            File archivo = new File("Actividad_liga.txt");
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Pattern pattern = Pattern.compile("^(\\w+) (ha vendido|ha comprado) a .* por (\\d[\\d,\\.]+) €$");
                Matcher matcher = pattern.matcher(linea);

                if (matcher.find()) {
                    String equipo = matcher.group(1);
                    String operacion = matcher.group(2);
                    String montoStr = matcher.group(3);

                    // Eliminar puntos y comas y convertir la cadena en un número
                    montoStr = montoStr.replaceAll("[,.]", "");
                    long monto = Long.parseLong(montoStr);

                    if (saldosEquipos.containsKey(equipo)) {
                        if (operacion.equals("ha vendido")) {
                            saldosEquipos.put(equipo, saldosEquipos.get(equipo) + monto);
                        } else if (operacion.equals("ha comprado")) {
                            saldosEquipos.put(equipo, saldosEquipos.get(equipo) - monto);
                        }
                    }
                }
            }

            // Imprimir el saldo de cada equipo
            for (Map.Entry<String, Long> entry : saldosEquipos.entrySet()) {
                System.out.println(entry.getKey() + " - Saldo: " + entry.getValue() + " €");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo 'Actividad_liga.txt'.");
        }
    }
}
