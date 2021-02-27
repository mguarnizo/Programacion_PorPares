package mundo.herencia;

public class Alumno extends Persona{
	//Atributos
	protected String grupo;
	protected char horario;
	
	//Constructor
	public Alumno(String nombre, String apellidos, int anioNacimiento) {
		super(nombre, apellidos, anioNacimiento);
	}
	
	//Metodos
	public void ponGrupo(String grupo, char horario) {
		if(grupo == null || grupo.length() == 0) {
			System.out.println("Grupo no valido");
		}
		else if(horario != 'M' && horario != 'T') {
			System.out.println("Horario no valido");
		}
		this.grupo = grupo;
		this.horario = horario;
	}
	
	public void imprimeGrupo() {
		System.out.println("Grupo : " + grupo + horario);
	}

}
