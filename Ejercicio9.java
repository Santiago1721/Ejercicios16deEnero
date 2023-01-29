import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random random = new Random();

        // Rellenar el array con números aleatorios entre 200 y 300
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(101) + 200;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Mostrar los números de la diagonal
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i][i] + " ");
            min = Math.min(min, array[i][i]);
            max = Math.max(max, array[i][i]);
            sum += array[i][i];
        }
        System.out.println();

        // Mostrar el mínimo, el máximo y la media de los números en la diagonal
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Media: " + (double) sum / 10);
    }
}
