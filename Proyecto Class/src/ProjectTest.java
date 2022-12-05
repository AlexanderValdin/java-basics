
public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project proj1 = new Project();
        Project proj2 = new Project("proyecto");
        Project proj3 = new Project("ajsd proyecto", "esta es una descripci�n");
        Project proj4 = new Project("tsda proyecto","aqu� describo este proyecto", 100000);

        // Crear un nuevo portafolio
        Portafolio portafolio = new Portafolio();

        // Set de nombre, descripci�n e initialCost del primer proyecto
        proj1.setNombre("Mi primer proyecto");
        proj1.setDescripcion("descripci�n de proyecto");
        proj1.setInitialCost(500000);

        // Imprimir el nombre y descripci�n de proj2
        System.out.println(proj2.getNombre());
        System.out.println(proj2.getDescripcion()); // deber�a ser null

        //Retorna la informaci�n de todos los proyectos
        proj1.elevatorPitch();
        proj2.elevatorPitch();
        proj3.elevatorPitch();
        proj4.elevatorPitch();

        // Agregar proyectos al protafolio
        portafolio.addProject(proj1);
        portafolio.addProject(proj2);
        portafolio.addProject(proj3);
        portafolio.addProject(proj4);

        // Prints the total cost of the Projects in the Portfolio
        System.out.println(portafolio.getPortfolioCost());
        
        // Shows the information of all projects in the portfolio and the portfolio's total cost
        portafolio.showPortfolio();
  
	}

}
