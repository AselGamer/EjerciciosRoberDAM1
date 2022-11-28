
public class Ejercicio07 {
	public final static int TAM = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros;
		int temp;

		numeros = new int[TAM];

		System.out.println("Contenido del array: ");
		for(int i = 0; i < TAM; i++) {
			numeros[i] += (int) (Math.random()*100+1);
			System.out.print(numeros[i] + " ");
		}
		temp = numeros[0];
		System.out.println();
		for(int i = 0; i < TAM; i++) {
			for(int j = 0; j < TAM -1 -i; j++) {
					if (numeros[j] > numeros[j + 1]) {
						temp = numeros[j];
						numeros[j] = numeros[j + 1];
						numeros[j + 1] = temp;
				} 
			}
		}
		System.out.println("Array ordenado: ");
		for(int i = 0; i < TAM; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
	}
}
