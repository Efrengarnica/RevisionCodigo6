import java.util.Scanner;

public class codigo6 {
	// El programa va a darte un arreglo de 20 elementos de números aleatorios y después te va a preguntar que números quieres resaltar
	//Eliges la opcion y te regresa los 20 numeros pero resaltando los que tu elegiste
	  
	public static void main(String[] args) { //Se agrego 
		Scanner in = new Scanner(System.in);
	    int[] n = new int[20]; //Se agrego la palabra new

	    for (int i = 0; i < 20; i++) {  //Se agrego un +
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //Se agrego el .out
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //Se agrego la n al final
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //int opcion = Integer.parseInt(System.console().readLine()); //Se agrego un parentesis que faltaba al final
	    //Creo que la opcion de arriba NO sirve para leer cosas en Eclipse
	    int opcion = in.nextInt();
	    int multiplo = (opcion == 1) ? 5 : 7; //Se invierten ? y :

	    for(int e : n) {  //Quitamos foreach y ponemos for y cambiamos char por int 
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] "); }//Cerramos el if
	       else {
	        System.out.print(e + " "); //cambiamos in por out
	      }
	    }//for
	    
	    
	}//main 
}// class Codigo6