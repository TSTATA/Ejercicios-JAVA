public class PruebaMCI2 {
	public static void main (String args[]) 	{
		ModuloCalculoImpl2 mci2 = new ModuloCalculoImpl2();
		System.out.println( mci2.modulo(mci2.suma(2, 3), 3) );
	}
}
