// crearemos la clase con dos atributos y 
// sus correspondientes métodos get y set
public class Lampara{
	private boolean luz;
	private int intensidad;
//	public  Lampara(boolean luz, int intensidad){
	public  Lampara(){
//		this.luz = luz;
//		this.intensidad = intensidad;
		this.luz = false;
		this.intensidad = 0;
	}
	public boolean getLuz(){
		return luz;
	}
	public void setLuz(boolean luz){
		this.luz = luz;
	}
	public int getIntensidad(){
		return intensidad;
	}
	public void setIntensidad(int intensidad){
        if (intensidad >= 0 && intensidad <=100) {
            this.intensidad = intensidad;
        } else {
            this.intensidad = 0;
        }    
    }

 public void setIntensidad(double voltaje) {
        if (voltaje <= 1.5) {
            this.intensidad = 0;
        } else if (voltaje >= 12.5) {
            this.intensidad = 100;         
        } else {
            this.intensidad = (int) (100/11.0 * (voltaje-1.5));
        }
    }

	// método : SalidaLuz
	public String SalidaLuz(){
		String textoLuz = "";
		if(this.luz){
			textoLuz = "encendida! ";
		}else{
			textoLuz = "apagada! ";
		}
//		return "lampara ( Luz " +textoLuz +"Intensidad "+intensidad+" )";
		return "lampara ( Luz " +textoLuz +"Intensidad "+this.intensidad+" )";
	}
}