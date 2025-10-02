package ACT_4;

public class ExcepcionPilaVacia extends RuntimeException{
    public ExcepcionPilaVacia(){
        this("La MarcoTeorico.Pila esta vacia");
    }

    public ExcepcionPilaVacia(String exception){
        super(exception);
    }
}
