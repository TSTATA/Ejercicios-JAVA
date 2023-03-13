// TSTATAVEHICULO
public class PruebaVehiculos {

    public static void main(String[] args) {
  // TODO code application logic here
        Vehiculos v1 = new Vehiculos("1234 BCD", "Opel", "Astra", 0, false);
        Vehiculos v2 = new Vehiculos("2345 CDE", "BMW", "S1", 80, false);
        Vehiculos v3 = new Vehiculos("3456 DEF", "Audi", "A3", 100, true);
        Vehiculos v4 = new Vehiculos("3456 DEF", "Audi", "A3", 0, false);
        v1.setVelocidad(50);
        v1.setLuces(true);
        v2.setLuces(true);
        v3.setLuces(true);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
		System.out.println("Ejercicio 2.1.1 (v4)");
		System.out.println(v4.toString());
		System.out.println("Ejercicio 2.1.2 (v5)");
		//System.out.println(v5.toString());
    }
}
