import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int elegido = 0;
		while (elegido != 4) {
				System.out.println("Elige una opcion");
				System.out.println("1.- Sumar pares");
				System.out.println("2.- Sumar impares");
				System.out.println("3.- Sumar todos");
				System.out.println("4.- Fin de programa");
			do {
				System.out.print("Elige opción: ");
				elegido = sc.nextInt();
				if (elegido > 4 || elegido < 0) {
					System.out.println("Numero invalido");
				}
			}while(elegido > 4 || elegido < 0);
			if (elegido == 1) {
				sumaPar();
			} else if (elegido == 2) {
				sumaImpar();
			} else if (elegido == 3) {
				sumaTodos();
			} else {
				System.out.println("Adios!");
			}
			
		}

	}
	public static void sumaPar() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int suma = 0;
		do {
			System.out.print("Introduce un numero (0 para acabar): ");
			num1 = sc.nextInt();
			if (num1 % 2 == 0) {
				suma += num1;
				}
		}while(num1 != 0);
		if (suma == 0) {
			System.out.println("No has introducido numeros pares");
		} else {
		System.out.println("La suma de los pares: " + suma);
		System.out.println();
		}
	}	
	public static void sumaImpar() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int suma = 0;
		do {
			System.out.print("Introduce un numero (0 para acabar): ");
			num1 = sc.nextInt();
			if (num1 % 2 != 0) {
				suma += num1;
				}
		}while(num1 != 0);
		if (suma == 0) {
			System.out.println("No has introducido numeros impares");
		} else {
		System.out.println("La suma de los impares: " + suma);
		System.out.println();
		}
	}
	public static void sumaTodos() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int suma = 0;
		do {
			System.out.print("Introduce un numero (0 para acabar): ");
			num1 = sc.nextInt();
				suma += num1;
		}while(num1 != 0);
		if (suma == 0) {
			System.out.println("No has introducido numeros");
			System.out.println();
		} else {
		System.out.println("La suma de todos: " + suma);
		System.out.println();
		}
	}
}
