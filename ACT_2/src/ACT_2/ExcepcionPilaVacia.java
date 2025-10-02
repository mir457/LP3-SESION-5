package ACT_2;

public class ExcepcionPilaVacia extends RuntimeException{
    public ExcepcionPilaVacia(){
        this("La MarcoTeorico.Pila esta vacia");
    }

    public ExcepcionPilaVacia(String exception){
        super(exception);
    }
}
