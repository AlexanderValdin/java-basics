
public class StringManipulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// trim and concat
		
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); 
		
		// get index or null
		
		StringManipulator manipulator2 = new StringManipulator();
		char letter = 'n';
		Integer a = manipulator2.getIndexOrNull("Coding", letter);
		Integer b = manipulator2.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator2.getIndexOrNull("Saludar", letter);
		System.out.println(a);
		System.out.println(b); 
		System.out.println(c);
		
		// get index or null 2
		
		StringManipulator manipulator3 = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer d = manipulator3.getIndexOrNull(word, subString);
		Integer e = manipulator3.getIndexOrNull(word, notSubString);
		System.out.println(d);
		System.out.println(e); 
		
		// concat substring
		
		StringManipulator manipulator4 = new StringManipulator();
		String word2 = manipulator4.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(word2);
	}

}
