
public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//triangulo(30);
		trianguloInverso(30, "@");
	}
	public static void triangulo(int filas) {
		int lineas = 0;
		if (filas > 30 || filas <= 0) {
			System.out.println("Numero invalido");
		} else {
			for (int i = 0; i < filas; i++) {
				lineas++;
				System.out.println();
				for (int j = 0; j < lineas; j++) {
					System.out.print("* ");
				}
			}
		}

	}
	public static void trianguloInverso(int filas, String str) {
		int lineas = filas + 1;
		if (filas > 30 || filas < 0) {
			System.out.println("Numero invalido");
		} else {
			for (int i = filas; i > 0; i--) {
				lineas--;
				System.out.println();
				for (int j = lineas; j > 0; j--) {
					System.out.print(str.charAt(0) + " ");
				}
			}
		}

	}
}
