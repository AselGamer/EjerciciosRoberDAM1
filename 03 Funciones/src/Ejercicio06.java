
public class Ejercicio06 {
	public static final int TAM = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numPrimos = 2;
		int cantPrimos = 0;
		int [] primerosPrimos = new int [TAM];

		/*for (int i = 0; i < 101; i++) {
			if(esPrimo(i) == true) {
				System.out.print(i + " ");
			}
		}
	}*/
		while (cantPrimos < 100) {
			if(esPrimo(numPrimos)) {
				primerosPrimos[cantPrimos] = numPrimos;
				cantPrimos++;
			}
			numPrimos++;
		}
		for (int i = 0; i < primerosPrimos.length; i++) {
			System.out.print(primerosPrimos[i] + " ");
		}
	}
	public static boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		/*for (int i = 0; i < 9; i+=2) {
			if (num % 10 == i) {
				return false;
			} 
		}*/



		return true;
	}
}
