public class EjercicioContenidos {
	public static void main(String[] args) {
		int[] array1 = {1, 1, 1, 2, 10, 3, 4};
		int[] array2 = {8, 4, 5, 2, 10, 14, 3};
		
		ordenarArray(array1);
		ordenarArray(array2);

		if(contenidosEn(array1, array2)) {
			System.out.println("El array1 esta contenido en array2");
		} else {
			System.out.println("El array1 no esta contenido en array2");
		}
	}
	
	public static void ordenarArray(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int  j=0; j<array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
	}
	
	public static boolean busquedaBinaria(int[] array, int numero) {
		boolean encontrado = false;
		int izquierda = 0;
		int derecha = array.length-1; 
		int centro = 0;
		while(encontrado==false && izquierda<=derecha) {
			centro = (izquierda+derecha) / 2;
			if(numero==array[centro]) {
				encontrado = true;
			} else if(numero<array[centro]) {
				derecha = centro - 1;
			} else {
				izquierda = centro + 1;
			}
		}
		return encontrado;
	}
	
	public static boolean contenidosEn(int[] array1, int[] array2) {
		int contador = 0;
		boolean contenido = true;
		for(int i=0; i<array1.length && contenido; i++) {
			if(!busquedaBinaria(array2, array1[i])) {
				contenido=false;
			}
		}
		return contenido;
	}
}			