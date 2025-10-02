package PROP_4;
import java.util.ArrayList;

public class Contenedor <F, S>{
	public ArrayList<Par<F,S>> ar;
	
    public Contenedor() {
        ar = new ArrayList<>();
    }
    
    public void agregarPar(F primero, S segundo) {
    	ar.add(new Par<> (primero, segundo));
    }
    
    public Par<F,S> obtenerPar(int indice) {
    	return ar.get(indice);
    }
    
    public ArrayList<Par<F,S>> obtenerTodosLosPares(){
    	return ar;
    }
    
    public void mostrarPares() {
    	for(Par<F,S> i: ar) {
    		System.out.println(i);
    	}
    }
}
