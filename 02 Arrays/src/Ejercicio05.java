
public class Ejercicio05 {
	public static final int TAM = 40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros;
		numeros = new int[TAM];
		int max = numeros[0];
		int maxPos = 0;
		int temp = 0;
		for(int cont = 0; cont < numeros.length; cont++) {
			numeros[cont] += (int) (Math.random()*90+10);
		}
		System.out.println("Contenido del array:");
		for(int cont = 0; cont < numeros.length; cont++) {
			if (cont % 20 == 0 && cont != 0) {
				System.out.println();
			}

			System.out.print(numeros[cont] + " ");

			if (numeros[cont] > max) {
				maxPos = cont;
				max = numeros[cont];
			}
		}
		if (numeros[numeros.length - 1] != max) {
			temp = numeros[numeros.length - 1];
			numeros[numeros.length - 1] = max;
			numeros[maxPos] = temp;
		}
		System.out.println();
		System.out.println();
		System.out.println("Una vez intercabiado el mayor:");
		for(int cont = 0; cont < numeros.length; cont++) {
			if (cont % 20 == 0 && cont != 0) {
				System.out.println();
			}
			System.out.print(numeros[cont] + " ");
		}
		System.out.println();
		//System.out.println("El numero mas grande es: " + max);
		//System.out.println("En la posicion: " + (maxPos + 1));
	} 

}
