import java.util.*;

public class TeoremaPitagorasTest {

	public static void main(String[] args) {
		
		
		Scanner entry1 = new Scanner(System.in);
		int cat1;
		System.out.println("Introduzca la medida del cateto 1 : ");
		cat1 = entry1.nextInt();
		
		Scanner entry2 = new Scanner(System.in);
		int cat2;
		System.out.println("Introduzca la medida del cateto 2 : ");
		cat2 = entry2.nextInt();
		
		TeoremaPitagoras resultado = new TeoremaPitagoras();         
        double output = resultado.calculoHipotenusa(cat1,cat2);   
        System.out.println("la hipotenusa es : " + output);
    

	}

}
