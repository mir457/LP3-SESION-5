package ACT_4;

public class ExcepcionPilaLlena extends RuntimeException {
	public ExcepcionPilaLlena() {
		this( "La MarcoTeorico.Pila esta llena" );
	}
	
	public ExcepcionPilaLlena( String excepcion )  {
		super( excepcion );
	}
}
