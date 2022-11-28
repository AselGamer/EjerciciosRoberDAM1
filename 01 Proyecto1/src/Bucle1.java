import java.util.Scanner;

public class Bucle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc;
		int num;
		int num1 = 1;

		System.out.println("Escribe un numero: ");
		sc = new Scanner(System.in);

		num = sc.nextInt();

		while (num <= 0) {
			System.out.println("Numero invalido introduzca un numero valido: ");
			sc = new Scanner(System.in);
			num = sc.nextInt();
		}
		while (num1 <= num) {
			System.out.println(num1 + ".- Hola");
			num1++;
		}
		System.out.println("Tiempo en milisegundos: " + System.currentTimeMillis() + "ms");

	}

}
