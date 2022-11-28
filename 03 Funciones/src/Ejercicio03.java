import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated methd stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double result;

		System.out.println("Introduce un numero a elevar: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el numero al que lo quieres elevar: ");
		num2 = sc.nextInt();

		result = Potencia(num1, num2);
		
		System.out.println(result);
	}
	public static double Potencia(int num1, int num2) {
		double poten = 1;
		if (num2 > 0) {
			for (int i=0;i<num2;i++) {
				poten *= num1;
			}
		} else {
			num2 *= -1;
			for (int i=0;i<num2;i++) {
				poten *= num1;
			}
		}
		return poten;
	}
}
