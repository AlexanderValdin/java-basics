import java.util.HashMap;

public class Tracklist {
	
	public void trackList(){
        
        HashMap<String, String> tracks = new HashMap<>(); 
       
        tracks.put("Ratas", "Criaturas alienadas por los tubos cat�dicos de sus televisores ...");
        tracks.put("El gran tirano", "Seg�n tu punto de vista, yo soy el malo, el villano en tu novela, el gran tirano..");
        tracks.put("Los continentales", "Si te cay� en gracia como conversamos...");
        tracks.put("Cuando nada vale nada","Los peque�os sitios crecen cuando en ellos nadie hay ...");
        
        System.out.println("Una de las canciones dice : "+ tracks.get("El gran tirano"));
        
        tracks.forEach((x,y) -> System.out.println("canci�n: " + x + ", letra : "+ y));
    }

}
