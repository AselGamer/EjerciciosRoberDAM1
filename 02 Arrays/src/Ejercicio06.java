
public class Ejercicio06 {
	public static final int TAM = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros;
		int temp;

		numeros = new int[TAM];

		System.out.println("Contenido del array: ");
		for(int i=0; i < TAM;i++) {
			numeros[i] += (int) (Math.random()*22-10);
			System.out.print(numeros[i] + " ");
		}
		temp = numeros[TAM - 1];
		System.out.println();
		System.out.println("Array desplazado: ");
		for (int i=TAM - 1; i > 0; i--) {
				numeros[i] = numeros[i - 1];
		}
		numeros[0] = temp;
		for(int i=0; i < TAM;i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
