public class Ejercicio3{

public static void main(String[] args) {
	
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    
    System.out.println("\n a continuacion se va a mostrar 3 columnas con los resultados");
    
    for (i = 0; i < 20; i++) {
      System.out.printf("%4n | %5n | %8n", numero[i], cuadrado[i], cubo[i]);
    }
}
}


