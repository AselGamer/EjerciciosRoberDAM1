import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num1;

		do {
			System.out.println("Introduce un numero, el programa finalizara en -99:");
			num1 = sc.nextInt();
			if (num1 == -99) {
				break;
			}
			else if (num1 < 0) {
				System.out.println("Numero invalido");
			} else {
				System.out.println(Factorial(num1));
			}
		} while(num1 < 0 || num1 >= 0);

		System.out.println("Programa Finalizado");

	}
	public static double Factorial(int num1) {

		double facto = 1;

		while (num1 != 0) {
			facto *= (double) num1;
			num1--;
		}

		return facto;
	}
}
