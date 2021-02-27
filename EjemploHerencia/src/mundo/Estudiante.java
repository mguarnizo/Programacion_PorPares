package mundo;

public class Estudiante extends Persona{
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante(String pNombre, String pApellido, int pEdad, int pCodigo, float pNotaF) {
		super(pNombre, pApellido, pEdad);
		codigoEstudiante = pCodigo;
		notaFinal = pNotaF;
	}
	
	public void mostrarNotas() {
		System.out.println("Nombre : " + getNombre() + "\nApellido : " + getApellido() + "\nEdad : " + getEdad() + "\nCodigo Estudiante : " + codigoEstudiante + "\nNota Final : " + notaFinal);
	}

}
