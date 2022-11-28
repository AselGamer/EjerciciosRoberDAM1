import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int num;
		int[] numeros;
		
		sc = new Scanner(System.in);
		numeros = new int[5];
		
		for (int i=0;i<numeros.length;i++) {
			System.out.println("Introduzca un numero para añadir al numeros en posicion " + (i+1) + " :");
			num = sc.nextInt();
			numeros[i] = num;
		}
		for (int i=numeros.length - 1;i != -1;i--) {
			System.out.print(numeros[i] + " ");
		}
	}

}
