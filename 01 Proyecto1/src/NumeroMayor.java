import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int num = 0;
		int cont = 0;
		int mayor = 0;
		int menor = 0;
		
		sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero, (la sequencia acabara cuando se introduzca 0 dos veces): ");
			num = sc.nextInt();
			if (num == 0) {
				cont++;
			} else if (cont == 1 && num != 0) {
				cont = 0;
			}
			if (num < menor) {
				menor = num;
			} if (num > mayor) {
				mayor = num;
			}
		}
		while (cont != 2);
		System.out.println("El mayor numero introducido: " + mayor);
		System.out.println("El menor numero introducido: " + menor);
	}

}
