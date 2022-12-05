import java.util.ArrayList;

public class Excepcion {
	
		public void myMethod() {
		ArrayList<Object> list = new ArrayList();
		list.add("hola");
		list.add(21);
		list.add("hola de nuevo");
		list.add(2323);
		list.add("Chao");
		
			for(int i=0; i<list.size(); i++) {
				try {
					Integer casteado = (Integer) list.get(i);
					System.out.println(casteado);
				}
				catch(ClassCastException e) {
				System.out.println("Error en el índice: " + i);
				}
			}
			
		}

	
	    public ArrayList<String> myMethod2(){
	        ArrayList<String> list = new ArrayList<>();
	        
	        list.add("1");
	        list.add(2); //no correrá por esta línea, removerla o comentarla
	        list.add("Hola");
	        list.add("Chao");
	        return list;
	    }
	}
}
