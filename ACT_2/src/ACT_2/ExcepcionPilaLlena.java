package ACT_2;

public class ExcepcionPilaLlena extends RuntimeException {
	public ExcepcionPilaLlena() {
		this( "La MarcoTeorico.Pila esta llena" );
	}
	
	public ExcepcionPilaLlena( String excepcion )  {
		super( excepcion );
	}
}
