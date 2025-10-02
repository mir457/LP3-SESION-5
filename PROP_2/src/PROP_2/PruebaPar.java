package PROP_2;

public class PruebaPar {
	public static void main(String[] args) {
		Par<String,String> a = new Par<>("Hola", "Mundo");
		Par<String, String> b = new Par <>("Mundo", "Hola");
		
		System.out.println("El par a y b son iguales: "+a.esIgual(b));
	}
}
