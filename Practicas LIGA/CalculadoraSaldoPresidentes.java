import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraSaldoPresidentes {

    public static void main(String[] args) {
        String inputFile = "entrada.txt";
        String outputFile = "salida.txt";

        Map<String, Integer[]> balances = new HashMap<>();

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
                    Integer[] existingBalances = balances.get(presidente);
                    existingBalances[0] += totalIngreso; // Ingreso total
                    existingBalances[1] += totalGasto; // Gasto total
                    existingBalances[2] += recompensaEuros; // Recompensa por puntos en euros
                    existingBalances[3] = saldoFinal; // Saldo final
                } else {
                    Integer[] newBalances = {totalIngreso, totalGasto, recompensaEuros, saldoFinal};
                    balances.put(presidente, newBalances);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer[]> entry : balances.entrySet()) {
                String presidente = entry.getKey();
                Integer[] balancesArray = entry.getValue();
                int ingresoTotal = balancesArray[0];
                int gastoTotal = balancesArray[1];
                int recompensaPuntosEuros = balancesArray[2];
                int saldoFinal = balancesArray[3];

                writer.write("Presidente: " + presidente + "\n");
                writer.write("Ingreso Total: " + ingresoTotal + "\n");
                writer.write("Gasto Total: " + gastoTotal + "\n");
                writer.write("Recompensa por Puntos en Euros: " + recompensaPuntosEuros + "\n");
                writer.write("Saldo Final: " + saldoFinal + "\n");
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Proceso completado. Resultados guardados en " + outputFile);
    }
}
