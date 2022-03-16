import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto = lector.nextLine();
		String textonuevo = "";
		for(int i = 0; i<texto.length(); i++) {
			if(texto.charAt(texto.length()-i-1)!=32) {
				textonuevo += texto.charAt(texto.length()-i-1); // Mejor imprimirlo que guardarlo en un String
			}
		}
		System.out.println(textonuevo);
	}
}
	