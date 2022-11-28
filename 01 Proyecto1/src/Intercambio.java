import java.util.Scanner;


public class Intercambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int num2;

		Scanner sc;

		sc = new Scanner(System.in);


		System.out.println("Escribe un numero: ");
		num = sc.nextInt();
		System.out.println("Escribe otro numero: ");
		num2 = sc.nextInt();

		System.out.println("Estos son los numeros: num = "+ num +" num = "+ num2);

		//Con una variable
		int temp = num;
		num = num2;
		num2 = temp;

		//Aritmetrica:
		/*num = num + num2;
		num2 = num - num2;
		num = num - num2;*/

		System.out.println("Ahora los valores son. num = "+ num +" num2 = "+ num2);

	}

}
