import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraSaldoPresidentes {

    public static void main(String[] args) {
        String inputFile = "entrada.txt";
        String outputFile = "salida.txt";

        Map<String, Integer> balances = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String presidente = parts[0];
                String[] ingresos = parts[1].split(":")[1].split("\\+");
                String[] gastos = parts[2].split(":")[1].split("\\+");
                int puntos = Integer.parseInt(parts[3].split(":")[1]);

                int totalIngreso = 0;
                int totalGasto = 0;

                for (String ingresoStr : ingresos) {
                    totalIngreso += Integer.parseInt(ingresoStr);
                }

                for (String gastoStr : gastos) {
                    totalGasto += Integer.parseInt(gastoStr);
                }

                int saldo = totalIngreso - totalGasto;
                int recompensaEuros = puntos * 100000;

                int saldoFinal = saldo + recompensaEuros;

                if (balances.containsKey(presidente)) {
                    saldoFinal += balances.get(presidente);
                }

                balances.put(presidente, saldoFinal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : balances.entrySet()) {
                String presidente = entry.getKey();
                int saldoFinal = entry.getValue();
                writer.write(presidente + ",saldo_final:" + saldoFinal + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Proceso completado. Resultados guardados en " + outputFile);
    }
}
