public class Ejercicio3{

public static void main(String[] args) {
	
    
    int[] numero = new int[20];            //aqui declaramos las tres variables de array y le damos un espacio de 20 caracteres a cada una
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    int i;                             //definimos variable i ya que la utilizaremos no solo en el ciclo for sino tambien en para referenciarla,
	                               //junto con las variables numero caudrado y cubo
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);            //aqui con la clase random(aleatoria) indicamos que seleccione numeros aleatorios hasta 100
      cuadrado[i] = numero[i] * numero[i];            // aqui para encontrar el cuadrado de los numeros multiplicamos numero por numero
      cubo[i] = cuadrado[i] * numero[i];              //para encontrar el cubo multiplicamos los numeros que han resultado de la operacion de cuadrado con los numeros comunes
    }
    
    System.out.println("\n a continuacion se va a mostrar 3 columnas con los resultados");  
    
    for (i = 0; i < 20; i++) {             //aqui para mostrar los resultados de nuevo realizamos otro bucle for 
      System.out.printf("%4n | %5n | %8n", numero[i], cuadrado[i], cubo[i]);  //aqui para organizar los numeros en forma de tabla le organizamos un caracter a cada uno segun el
	                                                                      //el orden en que pongamos la variable ,primero numero lueg cuadrado y despues cubo
    }
}
}


