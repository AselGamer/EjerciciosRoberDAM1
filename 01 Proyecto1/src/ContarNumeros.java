import java.util.Scanner;

public class ContarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int num = 0;
		int cont = 0;
		int pos = 0;
		int neg = 0;
		int cer = 0;

		sc = new Scanner(System.in);

		while (num != -999) {
			try {
				System.out.print("Introduce un numero (-999 para terminar): ");
				num = sc.nextInt();	
				if (num > 0) {
					pos++;
				} else if(num < 0) {
					neg++;
				} else{
					cer++;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Valor invalido, introduzca un valor valido");
				sc.next();
			}

		}
		System.out.println("Has introducido: ");
		System.out.println("positivos: " + pos);
		System.out.println("negativos: " + neg);
		System.out.println("ceros: " + cer);
	}

}
