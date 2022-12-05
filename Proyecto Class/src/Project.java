
public class Project {
	
	
	private String nombre;
	private String descripcion;
	private double initialCost;
	
	
	//sobrecarga del método Project()
	
	public Project() {		
	}
	public Project(String nombre) {
		this.nombre = nombre;
	}
	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public Project(String nombre, String descripcion, double initialCost) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
	}
	
	// Crear una instancia de método que se llame elevatorPitch
	
	public String elevatorPitch() {
		return this.nombre + ":"+ this.descripcion;
	}
	// Set 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	
	//get
	
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getInitialCost() {
		return initialCost;
	}
	
	
}
