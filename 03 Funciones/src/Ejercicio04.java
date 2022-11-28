import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int [100];
		int array2[] = new int[110];

		randi(array);
		mostrar(array);
		System.out.println();
		System.out.println();
		randi(array2);
		mostrar(array2);
		System.out.println();
		System.out.println();
		System.out.println(encontrar(20, 30, array2));
	}
	public static void randi(int array[]) {
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(49) + 1;
		}
	}
	public static void mostrar(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(array[i] + " ");
		}
	}
	public static boolean encontrar(int num1, int num2, int array[]) {
		boolean num1Check = false;
		boolean num2Check = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num1) {
				num1Check = true;
			} else if (array[i] == num2) {
				num2Check = true;
			}
		}
		if (num1Check && num2Check) {
			return true;
		}
		return false;
	}
}
