import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readFile, readInput;
		String archivo = "";
		String line;

		System.out.println("Introduce el nombre del archivo");
		readInput = new Scanner(System.in);
		archivo = readInput.next();
		readFile = new Scanner(archivo);

		try {
			readFile = new Scanner(new File(archivo));
			while(readFile.hasNext()) {
				line=readFile.nextLine();
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}


		readFile.close();
	}

}
