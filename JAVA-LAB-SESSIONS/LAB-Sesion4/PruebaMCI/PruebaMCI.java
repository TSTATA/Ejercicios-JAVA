// TSTATACALCULO
public class PruebaMCI {
	public static void main (String args[]) 	{
		ModuloCalculoImpl mci = new ModuloCalculoImpl();
		System.out.println( mci.multiplica(mci.suma(2, 3), 8) );
	}
}