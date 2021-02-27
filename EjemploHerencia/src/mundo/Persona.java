package mundo;

public class Persona {
	//Atributos
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	//Constructor
	public Persona(String pNombre, String pApellido, int pEdad) {
		nombre = pNombre;
		apellido = pApellido;
		edad = pEdad;
	}
	
	//Metodos getters

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	
	

}
