import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc;

		sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		num = sc.nextInt();

		System.out.println("Los multiplos de "+num+" son:");
		for(int cont=1;num*cont<=1000;cont++) {
			System.out.print(cont*num+" ");
			if (cont % 10 == 0) {
				System.out.println();
			}

		}
	}
}


