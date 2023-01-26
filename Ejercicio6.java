public class Ejercicio6 {

	public static void main(String[] args) throws InterruptedException {
		int[][] n = new int [6][6];
		n[0][0]= 3;
		n[0][1]= 5;
		n[2][1]= 8;
		n[2][2]= 7;
		n[3][2]= 7;
		n[3][3]= 3;
		n[4][3]= 9;
		n[4][4]= 5;
		n[5][4]= 10;
		n[5][5]= 9;
		
		
		int fila, columna;
		for(fila = 0; fila <6; fila++){
			
			System.out.print("Fila: " + fila);
			for(columna = 0; columna < 2; columna++) {
			System.out.printf("%10d ", n[fila][columna]);
			Thread.sleep(1000);                                   // retardo de un segundo
			}
			System.out.println();
			}
			}
			}
		
