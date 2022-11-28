import java.util.Random;
import java.util.Scanner;

public class Juego {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numero = rand.nextInt(999)+1;
		int numIntentos = 1;
		int numIntroducido;
		int numMenor = 1;
		int numMayor = 1000;
		String str = "";
		int cont = 0;

		do {
			do {
				if (numIntentos == 1) {
					System.out.println(numIntentos + ". " + "Introduce un numero del "+ numMenor + " al "+ numMayor + ": ");
				} else {
					System.out.println(numIntentos + ". " + str + "Introduce un numero del "+ numMenor + " al "+ numMayor + ": ");
				}
				numIntroducido = sc.nextInt();
				if (numIntroducido <= 0 || numIntroducido > numMayor) {
					System.out.println();
					System.out.println("Introduce un numero valido");
					System.out.println();
				}

			} while(numIntroducido <= 0 || numIntroducido > numMayor);



			if (numIntroducido > numero) {
				str = "El numero es menor que el introducido. ";
				if (numIntroducido > numMayor && numIntroducido != 1000) {
					numMayor = numIntroducido;
				}
				numIntentos++;
			} else if (numIntroducido < numero) {
				str = "El numero es mayor que el introducido. ";
				if (numIntroducido < numMenor) {
					numMenor = numIntroducido;
				}
				numIntentos++;
			}


		}while(numero != numIntroducido && numIntentos != 11);
		if (numIntroducido == numero) {
			System.out.println();
			System.out.println("Has ganado! El numero era " + numero + " y los has adivinado con " + numIntentos + " intentos restante/es");
		} else {
			System.out.println();
			System.out.println("Has perdido, el numero era "+ numero);
		}
	}

}
