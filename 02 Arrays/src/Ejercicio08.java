
public class Ejercicio08 {
	public final static int FILAS = 10;
	public final static int COLUM = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array;
		
		array = new int [FILAS][COLUM];
		
		System.out.println("Array bidimensional: ");
		System.out.println();
		for(int i=0; i<FILAS;i++) {
			for(int j=0;j<COLUM;j++) {
				array[i][j] = (int) (Math.random()*(31 - 20) + 20);
				System.out.print(array[i][j] + " ");
				if (j % (COLUM - 1)  == 0 && j != 0) {
					System.out.println();
				}
			}
		}
	}

}
