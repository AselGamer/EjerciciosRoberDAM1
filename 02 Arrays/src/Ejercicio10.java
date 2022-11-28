import java.util.Scanner;

public class Ejercicio10 {
	public static final int FILAS = 5;
	public static final int COLUM = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeros[][];
		int numTemp[];
		int linea;
		int linea2;
		int temp;

		numeros = new int[FILAS][COLUM];
		numTemp = new int[FILAS];

		for(int i=0; i<FILAS;i++) {
			for(int j=0;j<COLUM;j++) {
				numeros[i][j] = (int) (Math.random()*(100 - 10) + 10);
			}
		}
		for(int i=0; i<FILAS;i++) {
			System.out.print("Fila " + (i + 1) +": ");
			for(int j=0;j<COLUM;j++) {
				System.out.print(numeros[i][j] + " ");
				if (j % (COLUM- 1) == 0 && j != 0) {
					System.out.println();
				}
			}
		}

		System.out.println();
		do {
			System.out.print("Introduce la primera fila (1-5): ");
			linea = sc.nextInt();
			System.out.print("Introduce la segunda fila (1-5): ");
			linea2 = sc.nextInt();
			if (linea > 5 || linea < 1) {
				System.out.println("Valor incorrecto en linea 1");
			}
			if (linea2 > 5 || linea2 < 1 || linea == linea2) {
				System.out.println("Valor incorrecto en linea 2");
			}
		} while (linea > 5 || linea < 1 || linea2 > 5 || linea2 < 1);

		linea -= 1;
		linea2 -= 1;

		temp = 0;
		for (int i=0; i < FILAS; i++) {
			if (numeros[linea][i] > 50) {
				temp += numeros[linea][i];
			}
			if (numeros[linea2][i] > 50) {
				temp += numeros[linea2][i];
			}
		}
		System.out.println();
		System.out.println("La suma de los numeros mayores que 50 en ambas filas es: " + temp);
		for (int i=0; i < FILAS; i++) {
			numTemp[i] = numeros[linea][i]; 
			numeros[linea][i] = numeros[linea2][i];
			numeros[linea2][i] = numTemp[i];
		}
		System.out.println();
		System.out.println("Filas intercambiadas: ");
		for(int i=0; i<FILAS;i++) {
			System.out.print("Fila " + (i + 1) +": ");
			for(int j=0;j<COLUM;j++) {
				System.out.print(numeros[i][j] + " ");
				if (j % (COLUM- 1) == 0 && j != 0) {
					System.out.println();
				}
			}
		}
	}

}
