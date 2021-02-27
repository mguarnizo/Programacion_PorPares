package mundo.herencia;

public class Persona {
	//Atributos  (protected para que sea accesible desde las subclases)
	protected String nombre;
	protected String apellidos;
	protected int anioNacimiento;
	
	//Constructor
	public Persona(String nombre, String apellidos, int anioNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioNacimiento = anioNacimiento;
	}
	
	//Metodos
	public void imprime() {
		System.out.println("Datos personales : " + nombre 
				+ " " + apellidos + " (" + anioNacimiento + ") ");
	}

}
