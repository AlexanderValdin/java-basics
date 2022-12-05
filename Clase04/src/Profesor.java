
public class Profesor {

	private String nombre;
	private String apellido;
	private String asignatura;
	private String email;
	
	private int	horasClases;
	private int telefono;
		// TODO Auto-generated method stub
		
	  // Getter
	  public String getNombre() {
		    return nombre;
		  }
		  public String getApellido() {
			    return apellido;
			  }
		  public String getEmail() {
			  return email;
		  }
		  public int getTelefono() {
			  return telefono;
		  }
	  
	  public String getAsignaruta() {
		  return asignatura;
	  }
	  public int getHorasClases() {
		  return horasClases;
	  }
	  
	  
	  
	  // Setter
	  public void setNombre(String newNombre) {
	    this.nombre = newNombre;
	  }
	  public void setApellido(String newApellido) {
		    this.apellido = newApellido;
	  }
	  public void setAsignatura(String newAsignatura) {
		    this.asignatura = newAsignatura;
	  }
	  public void setEmail(String newEmail) {
		    this.email = newEmail;
	  }
	  public void setTelefono(int newTelefono) {
		    this.telefono = newTelefono;
	  }
	  public void setHorasClases(int newHorasClases) {
		  this.horasClases = newHorasClases;
	  }
}
