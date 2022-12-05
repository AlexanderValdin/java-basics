import java.util.*;
public class TestFizzBuzz {

	public static void main(String[] args) {
	
		Scanner entry = new Scanner(System.in);

		System.out.println("Ingresa un número ");
		int number = entry.nextInt();

		FizzBuzz test = new FizzBuzz();
		
		String resp = test.fizzBuzz(number);
	}

}
