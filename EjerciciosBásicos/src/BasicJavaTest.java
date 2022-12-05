import java.util.Arrays;

public class BasicJavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicJava test = new BasicJava();
		test.Imprimir1a255();
		test.ImprimirImpares1a255();
		test.ImprimeySuma();
        int[] myArray = {1, 5, 10, 7, -2};
        test.IterarArray(myArray);
        test.MaxValor(myArray);
        test.PromedioArray(myArray);
        System.out.println(test.ArregloImpares());
        System.out.println(test.MayoresY(myArray,4));
        System.out.println(Arrays.toString(test.ValorAlCuadrado(myArray)));
        System.out.println(Arrays.toString(test.EliminarNegativos(myArray)));
        System.out.println(Arrays.toString(test.MaxMinProm(myArray)));
        System.out.println(Arrays.toString(test.UnoHaciaAtras(myArray)));
	}

}
