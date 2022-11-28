import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		double fact = 1;
		String resp ="";
		Scanner sc;
		sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un numero positivo mayor que cero: ");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("No hay factorial de un numero negativo");
			} else if (num == 0){
				System.out.println("El factorial de 0 es 1");
			} else {
				System.out.print(num + " X ");
				while(num != 0) {
					fact = fact * num;
					num--;
					if (num == 1) {
						System.out.print(num + " = ");
					} else if(num != 0){
						System.out.print(num + " X ");
					}
				} 
				System.out.print(fact);
				System.out.println();
				do{
					System.out.println("Quieres calcular otro factorial?)(S/N)");
					resp = sc.next();
				} while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N"));
			}
		} while(resp.equalsIgnoreCase("S"));
		System.out.println("Programa finalizado");
	}

}
