package PROP_1;

public class Par <T,S> {
	public T primero;
	public S segundo;
	
	public Par(T p, S s) {
		this.primero = p;
		this.segundo = s;
	}
	
	public T getPrimero() {return primero;}
	public S getSegundo() {return segundo;}
	
	public void setPrimero(T nP) {primero = nP;}
	public void setSegundo(S nS) {segundo = nS;}
	
	
	public String toString() {
		return "Primero: "+primero+"\n Segundo: "+segundo+"\n";
	}
}
