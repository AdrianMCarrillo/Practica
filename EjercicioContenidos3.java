import java.util.Arrays;

public class EjercicioContenidos3 {
	public static void main(String[] args) {
		int[] array1 = {1, 1, 1, 2, 10, 3, 4};
		int[] array2 = {8, 4, 5, 2, 10, 14, 3};

		if(contenidosEn(array1, array2)) {
			System.out.println("El array1 esta contenido en array2");
		} else {
			System.out.println("El array1 no esta contenido en array2");
		}
	}
	
	public static boolean contenidosEn(int[] array1, int[] array2) {
	
		int[] a1 = Arrays.copyOf(array1, array1.length);
		Arrays.sort(a1);
		int[] a2 = Arrays.copyOf(array2, array2.length);
		Arrays.sort(a2);
		
		for(int i : a1) {
			System.out.print(i);
		}
		System.out.println();
		for(int i : a2) {
			System.out.print(i);
		}

		int contador = 0;
		boolean contenido = true;
		for(int i=0; i<array1.length && contenido; i++) {
			if(a1[contador]<a2[i]) {
				contenido = false; 
			}
			if(a1[contador]==a2[i]) {
				contador++;
				i--;
			}
			
			if(contador==array1.length) {
			i = array1.length; // salirse del bucle
			}
		}
		System.out.println(contador);
		return contenido;			
	}
}