package ejercicio02;

public class Arrays {

	public static int maximo(int[] t) {
		int max = 0;
		
		for (int numero : t) {
			if (numero>max) {
				max=numero;
			}
		}
		return(max);
	}

}
