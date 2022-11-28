import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int palillos = 15;
		String jug1;
		String jug2;
		Scanner sc = new Scanner(System.in);
		boolean turno = true;
		boolean perdedor = true;
		String rejugar = "Si";

		System.out.print("Introduce nombre Jugador 1: ");
		jug1 = sc.next();

		System.out.print("Introduce nombre Jugador 2: ");
		jug2 = sc.next();
		
		do {
			palillos = 15;
		
			if (!perdedor) {
				turno = !turno;
			}
			
			do {
				contPalillos(palillos);
				palillos -= quitarPalillos(jug1,jug2,sc,turno);
				turno = !turno;
				palillos = GanaPierde(jug1, jug2, turno, perdedor, palillos);
			} while(palillos > 1);
			
			System.out.println("Quieres volver a jugar? (Escribe: No. Para salir)");
			rejugar = sc.next();
		}while(rejugar.charAt(0) != 'N' || rejugar.charAt(0) != 'n');

	}
	public static void contPalillos(int num) {
		System.out.print("Quedan " + num + " palillos - ");
		for (int i = 1; i <= num; i++) {
			System.out.print("|");
			if (i % 5 == 0 && i != 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	public static int quitarPalillos(String jug1, String jug2, Scanner sc, boolean turno) {
		int palillos = 0;
		do {
			if (turno) {
				System.out.print("Turno: "+ jug1 + ". Elige numero de palillos a quitar (1-3): " );
				palillos = sc.nextInt();
			} else {
				System.out.print("Turno: "+ jug2 + ". Elige numero de palillos a quitar (1-3): " );
				palillos = sc.nextInt();
			}
			if (palillos > 3 || palillos < 1) {
				System.out.println("Introduce un valor valido");
			}
		}
		while(palillos > 3 || palillos < 1);
		return palillos;

	}
	public static int GanaPierde(String jug1, String jug2, boolean turno, boolean perdedor, int palillos) {
		if (palillos == 1 && turno || !turno && palillos == 0) {
			System.out.println("Has perdido " + jug1);
			perdedor = true;
		} else if (palillos == 1 && !turno  || turno && palillos == 0) {
			System.out.println("Has perdido " + jug2);
			perdedor = false;
		}
		return palillos;
	}
}
