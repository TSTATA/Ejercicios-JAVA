// Definición de la interfaz
interface FormaGeometrica {
    double calcularArea();
    double calcularPerimetro();
}

// Implementación de la interfaz en una clase
class Circulo implements FormaGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class MainYyy {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5.0);
        System.out.println("Area del circulo: " + miCirculo.calcularArea());
        System.out.println("Perimetro del circulo: " + miCirculo.calcularPerimetro());
    }
}
