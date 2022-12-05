import java.util.*; // import.java.ArrayList 
	public class BasicJava {
	
		// Escriba un m�todo que imprima todos los n�mero del 1 al 255.
		public void Imprimir1a255() {
			for (int i=1; i<=255; i++) {
				System.out.println(i);
			}
		}	
		
		// Escriba un m�todo que imprima todos los n�mero impares entre el 1 al 255.
		public void ImprimirImpares1a255() {
			for (int i= 1; i<=255; i++) {
				if (i%2 !=0) {
					System.out.println(i);
				}
			}
		}
		
		/* Escriba un m�todo que imprima los n�meros desde el 0 hasta el 255, 
		pero esta vez muestre tambi�n las suma de los n�meros que ha mostrado en pantalla hasta ahora.*/
		public void ImprimeySuma() {
			int suma = 0;
			for (int i=0; i<=255; i++) {
				suma += i;
				System.out.println("Nuevo n�mero: " + i + " , suma: " + suma);
			}
		}
		
		/* Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un m�todo que recorra cada uno de los elementos del 
		 arreglo e imprima cada valor. Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.*/
		public void IterarArray(int [] myArray) {
			for (int index : myArray) {
				System.out.println(index);
			}
		}
		
		/*Escribir un m�todo que tome un arreglo e imprima el valor m�ximo en el array. Su m�todo deber�a funcionar tambi�n 
		 * con todos los n�meros en negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de n�meros positivos, n�meros negativos y cero.*/
		public void MaxValor(int [] myArray) {
			int max = myArray[0];
			for(int index : myArray){
	            if(index > max){
	                max = index;
	            }
			}
			System.out.println("el n�mero mayor es: " + max);
		}
		
		/* Escribir un m�todo que tome un arreglo e imprima el promedio de los valores en el arreglo. Por ejemplo en un arreglo 
		 * hay [2,10,3], su m�todo deber�a Imprimir �Promedio de 5�. Nuevamente, aseg�rese de crear un caso simple y escriba las
		 *  instrucciones para resolver ese caso primero, luego pruebe sus instrucciones con casos m�s complicados.*/
		public void PromedioArray(int [] myArray) {
			 int suma = 0;
		     for(int number : myArray){
		    	 suma += number;
		     }
		     System.out.println(suma/myArray.length);
		}
		
		/* Escribir un m�todo que cree un arreglo �y� que contenga todos los n�meros impares entre 1 - 255. 
			Cuando el m�todo haya terminado, �y� debe tener los valores de [1,3,5,7�255]. */
		public ArrayList<Integer> ArregloImpares() {
	        ArrayList<Integer> imparArray= new ArrayList<Integer>();
	        for(int i=1; i<=255; i++) {
	            if(i%2 !=0) {
	                imparArray.add(i);
	            }
	        }
	        return imparArray;
		}
		
		/* Escribir un m�todo que tome un arreglo y devuelva el n�mero de valores mayores a un valor Y dado. Por ejemplo, 
		 * si el arreglo es [1,3,5,7] y Y = 3, despu�s de terminar el proceso el m�todo debe Imprimir el n�mero 2 
		 * (ya que hay 2 valores en el arreglo que son mayores que 3). */
		 public int MayoresY(int[] myArray, int y) {
			 int contador = 0;
			 for( int index : myArray) {
				 if(index >y);
				 contador++;
			 }
			 return contador;
		 }
		 
		 /* Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un m�todo que multiplique cada valor en el arreglo por s� mismo.
		  Cuando el m�todo haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4]. */
		 public int [] ValorAlCuadrado(int [] myArray) {
			 for(int i=0; i<myArray.length;i++) {
				 myArray[i]= (int) Math.pow(myArray[i],2);
			 }
			 return myArray;
		 }
		 
		 /* Dado un arreglo x, digamos [1,5,10,-2], escribir un m�todo que reemplace cualquier n�mero negativo por 0. 
		   Cuando el m�todo haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].*/
		 public int[] EliminarNegativos(int[] myArray) {
			 for(int i = 0; i < myArray.length; i++){
				 if(myArray[i]<0){
					 myArray[i] = 0;
		         }
		     }
		     return myArray;
		 } 
		 
		 /* Dado un arreglo x, digamos [1,5,10,-2], escribir un m�todo que devuelva un arreglo con el n�mero m�ximo, 
		 el n�mero m�nimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].*/
		 public double[] MaxMinProm(int[] myArray){
		     double max = myArray[0];
		     double min = myArray[0];
		     double suma = 0;
		     for(int i = 1; i< myArray.length; i++){
		    	 if(myArray[i]>max){
		    		 max = myArray[i];
		         }
		         if(myArray[i]<min){
		        	 min = myArray[i];
		         }
		         suma += myArray[i];
		        }
		        double[] newArray = {max, min, suma/myArray.length};
		        return newArray;
		    } 
		 
		 /* Dado un arreglo x, digamos [1,5,10,7,-2], escribir un m�todo que cambie cada valor por el valor que sigue. Por ejemplo, 
		  cuando el m�todo haya terminado, un arreglo x [1,5,10,7,-2] se convertir� en [5,10,7,-2,0]. Observe que el �ltimo n�mero es 0. 
		  El m�todo no necesita ajustarse para los valores que est�n fuera de los l�mites.*/
		 public int[] UnoHaciaAtras(int[] myArray){
			 for(int i=0; i<myArray.length-1; i++){
				 myArray[i] = myArray[i+1];
		     }
		     myArray[myArray.length-1] = 0;
		     return myArray;
		 }
		 
	}