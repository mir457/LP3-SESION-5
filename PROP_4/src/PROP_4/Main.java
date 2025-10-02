package PROP_4;

public class Main {
	public static void main(String[] arg) {
		Contenedor<String,Integer> con = new Contenedor<>();
		
		con.agregarPar("Miranda", 18);
		con.agregarPar("Gladys", 19);
		con.agregarPar("Benavente", 20);
		
		con.obtenerPar(2);
		
		con.mostrarPares();
	}
}
