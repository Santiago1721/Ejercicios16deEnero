package EjerciciosArraysObligatorios;

public class Ejercicio6 {
	  public static void main(String[] args) {
	    int[][] num = new int[3][6];
	    // Assign values to the elements of the array
	    for (int i = 0; i < num.length; i++) {
	      for (int j = 0; j < num[i].length; j++) {
	        num[i][j] = i + j;
	      }
	    }
	    // Display the elements of the array in table form
	    System.out.println("Tabla de elementos del array 'num':");
	    for (int i = 0; i < num.length; i++) {
	      for (int j = 0; j < num[i].length; j++) {
	        System.out.print(num[i][j] + " ");
	      }
	      System.out.println();
	    }
	  }
	}
		
