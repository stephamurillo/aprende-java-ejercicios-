package ejercicio5;

import java.util.Scanner;

public class index5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado=new Scanner(System.in);
		   double pesetas;
		   double conversion= 0.0016;
			  
	       System.out.print("Ingresa la cantidad de pecetas:");
	       pesetas= teclado.nextInt();		
	       double euro= pesetas*conversion ;
	       System.out.print("la conversion para euros es es:");
	       System.out.println(euro);
	       teclado.close();
	}

}
