public class LamparaPrueba{
	public static void main(String[] args){
//		Lampara L1 = new Lampara(true,5);
        Lampara l1 = new Lampara();
        Lampara l2 = new Lampara();
		
        l1.setLuz(true);
        l1.setIntensidad(5.5);
        System.out.println("l1: " + l1.SalidaLuz());
		
        l1.setIntensidad(50);
        System.out.println("l1: " + l1.SalidaLuz());
		
        l2.setLuz(true);
        l2.setIntensidad(1.5);
        System.out.println("l2: " + l2.SalidaLuz());
// solucion :
//l1: lampara ( Luz encendida! Intensidad 36 )
//l1: lampara ( Luz encendida! Intensidad 50 )
//l2: lampara ( Luz encendida! Intensidad 0 )
	}

}