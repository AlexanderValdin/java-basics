
public class Estudiante {

	private String nombre;
	private String apellido;
	private String carrera;
	private String email;
	private String situacion;
	
	private int telefono;

		  // Getter
		  public String getNombre() {
		    return nombre;
		  }
		  public String getApellido() {
			    return nombre;
			  }
		  public String getCarrera() {
			  return carrera;
		  }
		  public String getEmail() {
			  return email;
		  }
		  public int getTelefono() {
			  return telefono;
		  }
		  
		  
		  // Setter
		  public void setNombre(String newNombre) {
		    this.nombre = newNombre;
		  }
		  public void setApellido(String newApellido) {
			    this.apellido = newApellido;
		  }
		  public void setCarrera(String newCarrera) {
			    this.carrera = newCarrera;
		  }
		  public void setEmail(String newEmail) {
			    this.email = newEmail;
		  }
		  public void setTelefono(int newTelefono) {
			    this.telefono = newTelefono;
		  }
		
}
