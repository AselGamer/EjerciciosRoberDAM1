import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int nota;

		sc = new Scanner(System.in);
		System.out.println("Escribe un numero del uno al diez:");
		nota = sc.nextInt();

		switch (nota){
		case 0, 1, 2:
			System.out.println("MD/OG");
		break;
		case 3, 4:
			System.out.println("IN/GU");
		break;
		case 5:
			System.out.println("BN/ON");
			break;
		case 6:
			System.out.println("NT/OO");
			break;
		case 7,  8:
			System.out.println("NT/OO");
		break;
		case 9, 10:
			System.out.println("SB/BK");
		break;
		default:
			System.out.println("Nota no valida");
		}
		System.out.println("Tiempo en milisegundos: " + System.currentTimeMillis() + "ms");
	}

}
