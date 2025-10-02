package PROP_3;

public class Main {
	public static <F, S> void imprimirPar(Par<F,S> a) {
		System.out.println(a.toString());
	}
	
	public static void main(String[] args) {
		Persona p = new Persona("Miranda", 15);
		
		Par<String, Integer> d = new Par<>("Hola", 24);
		Par<Double, Boolean> b = new Par<>(6.7, true);
		Par<Persona, Integer> c = new Par<>(p, 6);
		
		imprimirPar(d);
		imprimirPar(b);
		imprimirPar(c);
	}
}
