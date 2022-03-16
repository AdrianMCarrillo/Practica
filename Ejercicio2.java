public class Ejercicio2 {
	public void m1(String s, String[] p) {
		s = "Azul";
		p[0] = "Rojo";
	}
	
	public static void main(String[] args) {
		String s="Amarillo";
		String[] p = {"Verde"};
		m1(s, p);
		System.out.print(s + '-' + p[0]);
	}
}
		