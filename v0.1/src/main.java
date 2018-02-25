/**
*
* @authors Eric Martin Jesus Calderon
* @version 1.0
*/

import java.util.*;

public class main {
	

	public static void main(String[] args)  {
	Scanner teclado = new Scanner(System.in);
       // Scanner waitForKeypress = new Scanner(System.in);
        		
       	boolean salir = false;
        int opcion;
        
		double numero1, numero2, resultado;
		
		String ANSI_RED_BACKGROUND = "\u001B[41m";
		String ROJO = "\u001B[1;31m";
		String NORMAL = "\u001B[0m";
		String AMARILLO = "\u001B[1;33m";
		String VERDE = "\u001B[1;32m";
		String AZUL = "\u001B[1;34m";
		String NEGRITA = "\u001B[1m";
		String AZULETE = "\u001B[1;36m";
		
      while (!salir) {
        	System.out.println("CALCUTESTER v0.1\n\n");
        						 
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃        "+AZUL+"¿Qué operación deseas realizar?"+NORMAL+"                              ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
            System.out.println("┃        Pulsa 1 si deseas realizar una suma                          ┃");
            System.out.println("┃        Pulsa 2 si deseas realizar una resta                         ┃");
            System.out.println("┃        Pulsa 3 si deseas realizar una multiplicación                ┃");
            System.out.println("┃        Pulsa 4 si deseas realizar una división                      ┃");
            System.out.println("┃        Pulsa 5 si deseas realizar una potencia                      ┃");
            System.out.println("┃        Pulsa 6 si deseas realizar una raíz                          ┃");
            System.out.println("┃        Pulsa 7 si deseas realizar un logaritmo                      ┃");
            System.out.println("┃        Pulsa 8 si deseas realizar una operacion factorial           ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
            System.out.println("┃        Pulsa 0 si deseas salir                                      ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            
            
            System.out.println("┃        "+AMARILLO+"PRÓXIMAMENTE NUEVAS FUNCIONES"+NORMAL+"                                ┃");
            System.out.println("\n\n");
      
 switch(opcion){
	 case '1':
		System.out.println("Introduce el primer número:");			
		numero1 = teclado.nextDouble();
		System.out.println("Introduce el segundo número:");
		numero2 = teclado.nextDouble();
		resultado = numero1+numero2;
		System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
	 case '8': salir=true; 
	}//fin switch
	}
}
