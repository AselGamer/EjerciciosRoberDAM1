
public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int previo = 0;
		int sumados = 0;
		int numeros[];

		numeros = new int[30];

		System.out.println("Contenido del array: ");
		for (int cont = 0; cont < 30; cont++) {
			if (cont % 10 == 0 && cont != 0) {
				System.out.println();
			}
			numeros[cont] = (int) (Math.random()*100+0);
			System.out.print(numeros[cont] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Numeros pares en posiciones impares en el array: ");
		for (int cont = 0; cont < 30; cont++) {
			if (cont % 2 == 0 && numeros[cont] % 2 == 0) {
				System.out.print(numeros[cont] + " ");
				previo = numeros[cont] + previo;
				sumados++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("La suma de los elementos pares en posiciones impares es: " + previo);
		System.out.println("La cantidad de pares sumados: " + sumados);
	}
}
