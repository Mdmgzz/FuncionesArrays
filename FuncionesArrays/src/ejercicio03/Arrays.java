package ejercicio03;

public class Arrays {
	
	int buscar(int t[], int clave) {
		int numClave = 7;
		int res = 0;
		
		for (int i=0;i<t.length;i++) {
			if (t[i]==numClave) {
				res=i;
			}else {
				res=-1;
			}
		}
		return res;
	}

}
