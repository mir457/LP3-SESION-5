package PROP_2;

public class Par <F,S> {
	public F primero;
	public S segundo;
	
	public Par(F p, S s) {
		this.primero = p;
		this.segundo = s;
	}
	
	public F getPrimero() {return primero;}
	public S getSegundo() {return segundo;}
	
	public void setPrimero(F nP) {primero = nP;}
	public void setSegundo(S nS) {segundo = nS;}
	
	
	public String toString() {
		return "Primero: "+primero+"\n Segundo: "+segundo+"\n";
	}
	
	public boolean esIgual(Par<F,S> a) {		
		if((!primero.equals(a.primero)) || (!segundo.equals(a.segundo))) {
			return false;
		}
		return true;
	}
}
