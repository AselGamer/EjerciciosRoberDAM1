import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner archivo = new Scanner("");
		Scanner teclado = new Scanner(System.in);
		String nombreArchivo;


		System.out.print("Introduce el nombre del archivo: ");
		nombreArchivo = teclado.next();
		try {
			archivo = new Scanner(new File(nombreArchivo));
			System.out.println("Estadisticas del archivo: ");
			System.out.println("Numero de lineas: " + cuentaLineas(archivo));
			archivo = new Scanner(new File(nombreArchivo));
			System.out.println("Numero de palabras: " + cuentaPalabras(archivo));
			archivo = new Scanner(new File(nombreArchivo));
			System.out.println("Numero de letras: " + cuentaLetras(archivo));
			archivo = new Scanner(new File(nombreArchivo));
			System.out.println("Numero de a's: " + cuentaCharacter(archivo, 'a'));
		} catch(FileNotFoundException e) {
			System.out.println("Archivo no encotrado");
		}
	}
	public static int cuentaLineas(Scanner archivo) {
		int lineas = 0;
		while(archivo.hasNextLine() == true) {
			lineas++;
			archivo.nextLine();

		}
		return lineas;
	}

	public static int cuentaPalabras(Scanner archivo) {
		int pal = 0;
		String linea = "";
		while(archivo.hasNextLine()) {


			linea = archivo.nextLine();

			//linea = linea.replaceAll(System.getProperty("line.separator")," ");

			String[] palLinea = linea.split("\\s");


			pal += palLinea.length;

		}
		return pal;
	}

	public static int cuentaLetras(Scanner archivo) {
		int chara = 0;
		String linea = "";
		while(archivo.hasNextLine()) {


			linea = archivo.nextLine();

			linea = linea.replaceAll(System.getProperty("line.separator")," ");

			String[] palLinea = linea.split("\\s*");


			chara += palLinea.length;

		}
		return chara;
	}
	public static int cuentaCharacter(Scanner archivo, char buscado) {
		int encontrado = 0;
		String linea = "";
		while(archivo.hasNextLine()) {

			linea = linea.toLowerCase();

			linea = archivo.nextLine();

			linea = linea.replaceAll(System.getProperty("line.separator")," ");

			String[] palLinea = linea.split("\\s*");
			
			for (int i = 0; i < palLinea.length; i++) {
				if (linea.charAt(i) == buscado) {
					encontrado++;
				}
			}


		}
		return encontrado;
	}

}
