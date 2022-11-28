import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int notas;
		int resultado;
		int aprob = 0;
		int suma = 0;
		float media = 0;

		sc = new Scanner(System.in);

		System.out.print("Cuantas notas quieres introducir?: ");
		notas = sc.nextInt();

		if (notas == 0) {
			System.out.println("No hay notas a calcular");
		} else if (notas < 0) {
			System.out.println("Numero invalido, reinicie el programa para calcular un numero valido");
		} else {
			for (int cont = 1;cont <= notas;cont++) {
				System.out.println("Nota " + cont + ":");
				resultado = sc.nextInt();
				if (resultado > 0 || resultado < 10) {
					System.out.println("Nota invalida introduce una nota valida");
					cont--;
				} else {
					suma += resultado;
					
				}
				if (resultado > 4) {
					aprob++;
				}
			}
			media = (float) suma/notas;
			//System.out.println(suma);
			System.out.println("Resultados:");
			System.out.println("Numero de aprobados: "+ aprob);
			System.out.println("La media es: " + media);
		}
	}
}
