import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresa un número");
		
		Scanner entry = new Scanner(System.in);
		
		int num = entry.nextInt();
		
		if (num % 2 == 0) {
			
			System.out.println("El número ingresado es divisible por 2");
		}
		else if (num % 2 != 0) {
			
			System.out.println("El número ingresado no es divisible por 2");
		}
		
		
	}

}
