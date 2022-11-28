import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int num, num1, result;
		String respuesta;

		sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			System.out.println("La tabla de multiplicar es:");
			for (num1=1;num1<=10;num1++) {
				result = num * num1;
				System.out.println(num +" X "+ num1 + " = " + result);
			}

			do{
				System.out.println("Quieres calcular otra tabla de multiplicar)(S/N)");
				respuesta = sc.next();
			} while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
		} while (respuesta.equalsIgnoreCase("S"));
		System.out.println("Fin del programa");
	}
}
