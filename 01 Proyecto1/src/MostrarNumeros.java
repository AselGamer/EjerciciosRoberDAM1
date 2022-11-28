import java.util.Scanner;

public class MostrarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int num;
		int num1;
		int cont = 0;

		sc = new Scanner(System.in);
		System.out.println("Introduce un numero (<0): ");
		num = sc.nextInt();

		System.out.println("Introduce otro numero (<0): ");
		num1 = sc.nextInt();

		while (num <= 0) {
			System.out.println("Introduce el primer numero otra vez (numero invalido): ");
			num = sc.nextInt();
		}
		while (num1 <= 0){
			System.out.println("Introduce el segundo numero otra vez (numero invalido): ");
			num1 = sc.nextInt();
		}


		if (num < num1) {while (num <= num1) {
			System.out.print(num + " ");
			num++;
			cont++;
			if (cont % 15 == 0) {
				System.out.println();
			}
		} 
		}else{
			while (num1 <= num)
			{System.out.print(num1 + " ");
			num1++;
			cont++;
			if (cont % 15 == 0) {
				System.out.println();
			}
			}
		}
		//System.out.println("Tiempo en milisegundos: " + System.currentTimeMillis() + "ms");
	}
}
