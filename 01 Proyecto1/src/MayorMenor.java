import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num2;
		Scanner sc;


		System.out.println("Escribe un numero:");
		sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Escribe otro numero:");
		sc = new Scanner(System.in);
		num2 = sc.nextInt();

		if (num > num2) {
			System.out.println("Los numeros (de menor a mayor) son:");
			System.out.println(num2);
			System.out.println(num);
		}else if(num == num2){System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros (de menor a mayor) son:");
			System.out.println(num);
			System.out.println(num2);
		}
		System.out.println("Tiempo en milisegundos: " + System.currentTimeMillis() + "ms");
	}

}
