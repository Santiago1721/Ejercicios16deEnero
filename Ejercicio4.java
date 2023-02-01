import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        int[] nums = new int[15];   //aqui declaramos el array nums (numeros) y le damos un espacio de 15 caracteres

        
        for (int i = 0; i < 15; i++) {    //realizamos un bucle que lea todos los numeros que le introduzcamos por teclado hasta el valor 15
            System.out.print("Ingrese un número: ");
            nums[i] = lector.nextInt();  //esto se usa para declarar que los valores de nums se almacenaran aqui
        }

 
        int ultimo = nums[14];          //aqui se crea otra variable ultimo para almacenar las variables de los numeros pero en reversa 
        for (int i = 14; i > 0; i--) {  //en este bucle for le damos que lea los numeros desde el el 14 hasta el cero y que vaya bajando posiciones con el i--
            nums[i] = nums[i - 1];      //aqui  le indicamos que voltee los numeros del bucle for
        }
        nums[0] = ultimo;

        // Mostrar contenido del array
        System.out.println("\nContenido del array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

