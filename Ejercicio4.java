import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int[] nums = new int[15];

        // Leer 15 números por teclado
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese un número: ");
            nums[i] = lector.nextInt();
        }

        // Rotar elementos del array
        int ultimo = nums[14];
        for (int i = 14; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = ultimo;

        // Mostrar contenido del array
        System.out.println("\nContenido del array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

