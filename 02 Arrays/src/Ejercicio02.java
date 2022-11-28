import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros[];
		int num1;
		
		numeros = new int[20];
		
		System.out.println("Introduce un numero: ");
		num1 = sc.nextInt();
		for (int i = 1; i <= numeros.length; i++) {
			numeros[i - 1] = num1 + i;
		}
		System.out.println("Contenido del array: ");
		for (int cont = 0; cont < numeros.length; cont++) {
			if (cont % 5 == 0 && cont != 0) {
				System.out.println();
			}
			System.out.print(numeros[cont] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Estos son los numeros pares: ");
		for (int cont = 0; cont < numeros.length; cont++) {
			if (numeros[cont] % 2 == 0 && cont != 0) {
				System.out.print(numeros[cont] + " ");

			}
		}
	}

}
