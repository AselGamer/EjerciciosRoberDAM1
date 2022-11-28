import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fraseAux;
		char[] frase;
		boolean palindromo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		fraseAux = sc.nextLine();


		frase=fraseAux.toLowerCase().replaceAll("\\s+", "").toCharArray();

		int posFinal = frase.length - 1;
		int posInicio = 0;
		
		palindromo = true;
		while (posInicio <= posFinal) {
			if (frase[posInicio]!=frase[posFinal]) {
				System.out.println("No es palindromo");
				palindromo = false;
				break;
			}
				posInicio++;
				posFinal--;
			}
		if (palindromo) {
			System.out.println("Es palindromo");
		}
	}
}

