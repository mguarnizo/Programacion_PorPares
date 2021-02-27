package mundo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante("Maria ", "Guarnizo ", 23, 1104, 11.4f);
		estudiante.mostrarNotas();
		System.out.println(estudiante.getApellido());

	}

}
