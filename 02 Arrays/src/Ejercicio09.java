import java.util.HashMap;
import java.util.Map;

public class Ejercicio09 {
	public final static int COLUM = 8;
	public final static int FILAS = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tablero;

		tablero = new char[COLUM][FILAS];
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		map.put(0, 'T');
		map.put(1, 'C');
		map.put(2, 'A');
		map.put(3, 'R');
		map.put(4, 'X');
		map.put(5, 'A');
		map.put(6, 'C');
		map.put(7, 'T');

		for(int i=0;i<8;i++) {
			tablero[1][i] = 'P';
			tablero[6][i] = 'P';
			tablero[2][i] = ' ';
			tablero[3][i] = ' ';
			tablero[4][i] = ' ';
			tablero[5][i] = ' ';
		}
		for(int j=0;j<8;j++) {
			tablero[0][j] = map.get(j);
			tablero[7][j] = map.get(j);
		}
		
		System.out.println("Tablero de ajedrez: ");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if (tablero[i][j] == ' ') {
					System.out.print(". ");
				} else {
					System.out.print(tablero[i][j] + " ");
				}
				if(j % (COLUM - 1) == 0 && j != 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Tablero de ajedrez girado: ");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if (tablero[j][i] == ' ') {
					System.out.print(". ");
				} else {
					System.out.print(tablero[j][i] + " ");
				}
				if(j % (COLUM - 1) == 0 && j != 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Negras y blancas cambiadas:");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if (tablero[i][j] == ' ') {
					System.out.print(". ");
				} else {
					System.out.print(tablero[7 - i][7 - j] + " ");
				}
				if(j % (COLUM - 1) == 0 && j != 0) {
					System.out.println();
				}
			}
		}
	}

}
