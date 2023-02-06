package ejercicio01;

public class Main {

	public static void main(String[] args) {
		// bloque de variables
		//creamos la tabla 
		
		int [] tabla= {1,2,3,4,5,6,7,8,9,10};
		long suma;
		//creamos la funcion que nos devuelve la suma
		// y llamamos a la funcion de la clase arrays para realizar la suma
		
		suma = Arrays.sumaTabla(tabla);
		
		// mostramos el resutado 
		System.out.println("El resultado de la suma de todos los elementos es: "+suma);

	}

}
