import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Collections;
import java.util.List;
import java.util.Random;
public class PuzzleJava {
	
	/* Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los n�meros en el arreglo. 
	 * El m�todo tambi�n debe retornar un arreglo que incluya solo los n�meros que son mayores a 10 (Por ejemplo cuando env�a el arreglo anterior,
	 *  debe retornar un arreglo con los valores de 13,25,32). */
	
	public static ArrayList<Integer> ImprimirRetorna(){
		int[] myArray = {3,5,1,2,7,9,8,13,25,32};
		int suma = 0;
		ArrayList<Integer> newArray = new ArrayList();
		for(int num : myArray){
			suma += num;
			if(num>10){
				newArray.add(num);
		    }
		}
		System.out.println("La suma es "+ suma);
		return newArray;
	}
		   
	/* Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de
	 * } cada persona. Haga que el m�todo tambi�n devuelva un arreglo con los nombres que tienes m�s de 5 caracteres.*/
	
	public static ArrayList<String> MezclarNombres(){
		String[] nombres = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		ArrayList<String> newArray = new ArrayList();
		List list = Arrays.asList(nombres);
		Collections.shuffle(list);
		for(String nombre : nombres){
			System.out.println(nombre);
		    if(nombre.length() > 5){
		    	newArray.add(nombre);
		    }
		}
		return newArray;
	}
	
	/* Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). Mezcle el arreglo y, 
	 * despu�s de mezclarlo, imprima la �ltima letra del arreglo. Tambi�n debe imprimir la primera letra del arreglo.
	 *  Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
	 */

	public static void mezclarAlfabeto(){  // dice 26 letras as� que asumo que excluye la � al ser una traducci�n del ingl�s
		String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Collections.shuffle(Arrays.asList(alfabeto));
		System.out.println("La �ltima letra es: "+ alfabeto[25]);
		System.out.println("La primer letra es: "+ alfabeto[0]);
		if(alfabeto[0] == "a" || alfabeto[0] == "e" || alfabeto[0] == "i" || alfabeto[0] == "o" || alfabeto[0] == "u"){
			System.out.println("La primera letra es una vocal");
		}
	}
		 
	// Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100.
	
	public static int[] genAleatArray(){
		int[] myArray = new int[10];
		Random aleat = new Random();
		for(int i=0; i<10; i++){
			myArray[i] = aleat.nextInt(46)+55;
		}
		return myArray;
	}
	
	/* Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100 y hacer que est�n ordenados (mostrar el n�mero m�s
	 *  peque�o en el principio del arreglo). Imprimir todos los n�meros del arreglo. Luego, Imprimir el valor m�nimo del arreglo,
	 *   as� como el valor m�ximo. */
	
	public static int[] genAleatOrd(){
		int[] myArray = genAleatArray(); // reciclamos el arreglo generado por el m�todo anterior
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		System.out.println("El m�nimo es : "+myArray[0]);
		System.out.println("El m�ximo es : "+myArray[9]);
		return myArray;
	}
	
	// Crear una cadena aleatoria con 5 caracteres de longitud.
	
	public static String genAleatString(){
		Random rand = new Random();
		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String str = ""; // variable str donde guardaremos los 5 caracteres aleatorios
		for(int i = 0; i<5; i++){
			int indice = rand.nextInt(26);
			str += alfabeto[indice];
		}
		return str;
	}
	
	// Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.
	
	public static String[] genArrayString(){
		String[] myArray = new String[10];
		for(int i=0; i<10; i++){
			myArray[i]=genAleatString(); // reutilizamos el m�todo anterior
		}
		return myArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ImprimirRetorna());
		System.out.println(MezclarNombres());
		mezclarAlfabeto();
		System.out.println(Arrays.toString(genAleatArray()));
		genAleatOrd();
		System.out.println(genAleatString());
		System.out.println(Arrays.toString(genArrayString()));
	}
}
