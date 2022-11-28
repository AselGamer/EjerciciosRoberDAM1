import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		/*
		holaMundo();
		System.out.println();
		System.out.println("Adios");
		System.out.println();
		holaMundo(8);
		*/
		System.out.println("Introduce 3 numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		System.out.println(sumaResta(num1, num2, num3));
	}

	public static void holaMundo() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo");	
		}
	}
	public static void holaMundo(int N) {
		for (int i = 0; i < N; i++) {
			System.out.println("Hola mundo");	
		}
	}
	public static int sumaResta(int num1, int num2, int num3) {
		return((num1 + num2) - num3);
	}
}
