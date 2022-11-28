import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args){
		//Salida por pantalla
		System.out.println("Hola Mundo");

		//Entrada por datos de teclado
		Scanner sc; //instanciacion

		sc = new Scanner(System.in); //
		int num;

		System.out.println("Escribe un numero:");
		num = sc.nextInt();

		System.out.println("Tu numero es " + num);
		System.out.println("Su mitad (redondeada) es  "+ (float)num / 2);
	}

}