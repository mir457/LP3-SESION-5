package PROP_3;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Persona persona = (Persona) obj;

        return edad == persona.edad && nombre.equals(persona.nombre);
    }
    
    @Override
    public String toString() {
    	return "Nombre: "+nombre+"\nEdad: "+edad;
    }
}
