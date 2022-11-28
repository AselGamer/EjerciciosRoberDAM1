
public class Ejercicio11 {
	public static final int TAM = 10;
	public static final int TAM2 = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		int[] array2;
		int[] combinados;
		int temp;
		int pos = 0;
		int pos2 = 0;
		
		array = new int [TAM];
		array2 = new int [TAM];
		combinados = new int [TAM2];

		for(int i=0; i<TAM;i++) {
			array[i] = (int) (Math.random()*(100 - 1) + 1);
			array2[i] = (int) (Math.random()*(100 - 1) + 1);
		}
		for (int j=0; j<TAM - 1;j++) {
			for(int i=0; i<TAM - 1;i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
				if (array2[i] > array2[i + 1]) {
					temp = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = temp;
				}
			}
		}
		System.out.print("Array 1 ordenado: ");
		for(int i=0; i<TAM;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Array 2 ordenado: ");
		for(int i=0; i<TAM;i++) {
			System.out.print(array2[i] + " ");
		}
		for (int j=0; j<TAM2;j++) {
				if (array[pos] <= array2[pos2]) {
					combinados[j] = array[pos];
					if (pos<TAM - 1) {
						pos++;
					}
				} else if (array[pos] > array2[pos2]) {
					combinados[j] = array2[pos2];
					if (pos2<TAM - 1) {
						pos2++;
					}
			}
		}
		System.out.println();
		System.out.print("Array 3: ");
		for(int i=0; i<TAM2;i++) {
			System.out.print(combinados[i] + " ");
		}
	}

}
