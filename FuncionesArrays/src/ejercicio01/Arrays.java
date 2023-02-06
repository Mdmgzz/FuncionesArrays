package ejercicio01;

public class Arrays {

		public static long sumaTabla(int [] tabla) {
			long suma=0;
			
			for (int elemento : tabla) {
				suma +=elemento;
			}
			return suma;
		}


}
