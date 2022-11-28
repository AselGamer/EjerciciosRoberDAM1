
public class Ejercicio04 {
	public static final int TAM = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[];		
		numeros = new int[TAM];

		System.out.print("Linea 1: ");
		for (int cont = 0; cont < numeros.length; cont++) {
			numeros[cont] += (int) (Math.random()*101-50);
			System.out.print("(" + (cont + 1) + ")" + numeros[cont] + " ");
			if ((cont+1) % 10 == 0 && cont<TAM-1) {
				System.out.println();
				System.out.print("Linea "+ ((cont /10) + 2) +": ");
			}
		}
		int posMin = 0;
		int posMax = 0;
		int min = numeros[0];
		int max = numeros[0];
		for (int cont = 0; cont < numeros.length; cont++) {
			if (numeros[cont] > max) {
				max = numeros[cont];
				posMax = cont + 1;
			} 
			if (numeros[cont] < min) {
				min = numeros[cont];
				posMin = cont + 1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("El mayor es " + max + " y esta en la posicion " +posMax);
		System.out.println("El menor es " + min + " y esta en la posicion " +posMin);
	}

}
