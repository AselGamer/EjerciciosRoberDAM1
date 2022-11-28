import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner lectorArchivo = null;
		Scanner entradaArchivo = null;
		Scanner salidaArchivo = null;
		PrintWriter salidaEscritor;
		File Archivo = new File("");

		String nombreArchivo, linea, escribir = "";

		lectorArchivo = new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo: ");
		nombreArchivo = lectorArchivo.next();
		try {
			entradaArchivo = new Scanner(new File(nombreArchivo));
		}catch(FileNotFoundException e) {
			System.out.println("El fichero de origen no existe");
			return;
		}

		System.out.println("Introduce el nombre del archivo de destino: ");
		nombreArchivo = lectorArchivo.next();
		try {
			salidaEscritor = new PrintWriter(new File(nombreArchivo));
			//TODO: Preguntar si el usuario quiere crear el archivo
			if (Archivo.exists() == false) {
				Archivo = new File(nombreArchivo);
				Archivo.createNewFile();
				while(entradaArchivo.hasNext()) {
					linea = entradaArchivo.nextLine();
					salidaEscritor.println(linea);
				}
			} else {
				System.out.println("Quieres sobreescribir el archivo? (si/no)");
				escribir = sc.next();
				if(truest(escribir) == true) {
					while(entradaArchivo.hasNext()) {
						linea = entradaArchivo.nextLine();
						salidaEscritor.println(linea);
					} 
				} else {
					System.out.println("No se ha sobreescribido");
					lectorArchivo.close();
					entradaArchivo.close();
					return;
				}
			}
			
		} catch(FileNotFoundException e) {
			lectorArchivo.close();
			entradaArchivo.close();
			return;
		}
	}
	public static boolean truest(String str) {
		if (str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("si") || str.equalsIgnoreCase("true")  || str.equalsIgnoreCase("True")) {
			return true;
		} else {
			return false;
		}
	}
}
