import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Leer temperaturas
        for (int i = 0; i < 12; i++) {
            System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
            temperaturas[i] = lector.nextDouble();
        }

        // Dibujar diagrama de barras
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
