package ACT_2;

public class Pila< E > {
    private final int tamanio;
    private int superior;
    private E[] elementos;

    public Pila(){
        this( 10 );
    }

    public Pila( int s ) {
        tamanio = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamanio];
    }

    public void push( E valorAMeter )  {
        if ( superior == tamanio - 1 )
            throw new ExcepcionPilaLlena( String.format("La MarcoTeorico.Pila esta llena, no se puede meter %s", valorAMeter ) );

        elementos[ ++superior ] = valorAMeter;
    }

    public E pop(){
        if ( superior == -1 )
            throw new ExcepcionPilaVacia( "La MarcoTeorico.Pila esta vacia, no se puede sacar" );
        return elementos[ superior-- ];
    }
    
    public boolean contains(E elemento) {
        for (int i = superior; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    
}
