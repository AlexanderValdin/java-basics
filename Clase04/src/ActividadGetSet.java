
public class ActividadGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profe1 = new Profesor();
		Profesor profe2 = new Profesor();
		
		Estudiante est1 = new Estudiante();
		Estudiante est2 = new Estudiante();
		
		// set profe1
		
		profe1.setNombre("Jos�");
		profe1.setApellido("P�rez");
		profe1.setAsignatura("Progra 101");
		profe1.setEmail("mail@mail.com");
		profe1.setTelefono(890182390);
		profe1.setHorasClases(4);
		
		// set profe2
		
		profe2.setNombre("Jos�");
		profe2.setApellido("Gonz�lez");
		profe2.setAsignatura("Progra 201");
		profe2.setEmail("mail2@mail.com");
		profe2.setTelefono(82394700);
		profe2.setHorasClases(5);
		
		// set est1
		
		est1.setNombre("Alexander");
		est1.setApellido("Valenzuela");
		
		// set est2
		
		est2.setNombre("Rafael");
		est2.setApellido("Dinamarca");
		
		System.out.println("el profesor " + profe1.getNombre() + " " + profe1.getApellido() +
				             " est� a cargo de la asignatura " + profe1.getAsignaruta() );
		
		System.out.println("el profesor " + profe2.getNombre() + " " + profe2.getApellido() +
	             " est� a cargo de la asignatura " + profe2.getAsignaruta() );
		
		
	}
}
