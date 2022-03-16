import java.util.Scanner;

public class Ejercicio4 {	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduce una nota: ");
		int nota = lector.nextInt();
		int[] frecuencia = new int[11];
		int contador = 0;
		int suma = 0;
		int mayor = 0;
		while(nota!=0) {
			if(nota>0 && nota<11) {
				frecuencia[nota]++;
				contador++;
				suma += nota;
				if(mayor<nota) {
					mayor = nota;
				}
			}
			System.out.print("Vuelve a Introducir una nota: ");
			nota = lector.nextInt();
		}
		
		double media = (double) (suma/contador);
		System.out.println("El valor  medio es: " + media);
		System.out.println("El valor mayor es: " + mayor);
		for(int i=1; i<frecuencia.length; i++) {
			System.out.println("La frecuencia de la nota " + i + " es: " + frecuencia[i]);
		}
	}
}	
		
				