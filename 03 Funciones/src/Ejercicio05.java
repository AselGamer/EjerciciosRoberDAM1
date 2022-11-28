import java.util.Iterator;
import java.util.Random;

public class Ejercicio05 {
	public static final int FILAS = 6;
	public static final int COLS = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numeros = new int [FILAS][COLS];
		int [] sumadosFilas = new int [COLS];
		int [] sumadosCol = new int [COLS];
		int[][] sumadosArrays = new int [FILAS][COLS];

		int maxFila;
		int fila;

		int maxCol;
		int col;

		llenar(numeros);
		leer(numeros);

		sumadosFilas = sumarFilas(numeros);

		System.out.println();
		System.out.println();
		System.out.print("La suma mas grande es: ");
		maxFila=0;
		fila=0;
		for (int i = 0; i < sumadosFilas.length; i++) {
			if (sumadosFilas[i] > maxFila) {
				maxFila = sumadosFilas[i];
				fila = i;

			}
		}
		System.out.print(maxFila + " en la fila " + (fila + 1));
		System.out.println();
		System.out.println("La columna con la suma mayor es: " + sumarCols(numeros, sumadosCol));

		System.out.println();
		System.out.println();
		mostrarArrays(numeros);
	}
	public static void llenar(int array[][]) {
		Random rnd = new Random();

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				array[i][j] = rnd.nextInt(99 - 10 + 1) + 10;
			}
		}
	}
	public static void leer(int array[][]) {
		for (int i = 0; i < FILAS; i++) {
			System.out.print("Fila " + (i + 1) + ": ");
			for (int j = 0; j < COLS; j++) {
				System.out.print(array[i][j] + " ");
				if (j == COLS - 1) {
					System.out.println();
				}
			}
		}
	}
	public static int[] sumarFilas(int array[][]) {
		int suma[] = new int[FILAS];

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				suma[i] += array[i][j];
			}
		}

		return suma;
	}
	public static int sumarCols(int array[][], int array2[]) {
		int mayor = 0;
		int numCol = 0;
		for (int i = 0; i < COLS; i++) {
			for (int j = 0; j < FILAS; j++) {
				array2[i] += array[j][i];
			}
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > mayor) {
				mayor = array2[i];
				numCol = i;
			}
		}
		return numCol + 1;
	}
	public static void mostrarArrays(int [][] array) {
		int [] filas;
		int [] columnas = new int [COLS];

		filas = sumarFilas(array);
		sumarCols(array, columnas);

		for (int i = 0; i < filas.length; i++) {
			System.out.println();
			for (int j = 0; j <= columnas.length; j++) {
				if (j < columnas.length) {
					System.out.print(" " + array[i][j] + " ");
				} else {
					System.out.print("= " + filas[i]);
				}
			}
		}
		System.out.println();
		for (int i = 0; i < columnas.length; i++) {
			System.out.print(columnas[i] +" ");
		}
	}
}

