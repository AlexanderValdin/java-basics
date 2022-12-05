
public class FizzBuzz {
	
		public String fizzBuzz(int number) {
			boolean fizz = false;
			boolean buzz = false;

			if(number%3 == 0){
				fizz = true;
				System.out.println("Fizz");
				return "El número  es divisible por 3";
			}
			if(number%5 == 0){
				buzz = true;
				System.out.println("Buzz");
				return "El número  es divisible por 5";
			}

			if( fizz == true && buzz == true){
				System.out.println("FizzBuzz");
				return "El número  es divisible por 3 y por 5";
				
			}else {
				System.out.println(number);
				return "El número no es divisible ni por 3 ni por 5";
				
			}
		
		}
}