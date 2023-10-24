// Definición de la interfaz
interface Vehiculo {
    void acelerar(int velocidad);
    void frenar();
    int obtenerVelocidad();
}

// Implementación de la interfaz en una clase
class Coche implements Vehiculo {
    private int velocidad;

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }

    public void frenar() {
        this.velocidad = 0;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }
}

public class MainXxx {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.acelerar(50);
        miCoche.acelerar(20);
        System.out.println("Velocidad del coche: " + miCoche.obtenerVelocidad());
        miCoche.frenar();
        System.out.println("Velocidad del coche: " + miCoche.obtenerVelocidad());
    }
}
