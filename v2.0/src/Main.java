

/**
*
* @author Eric Martin / Jesus Calderon
* @version 2.0
*/

import java.util.*;
import java.lang.Math;

public class Main {

	
	private static Scanner teclado;

	public static void main(String[] args)  {
		
		
		//WE IMPORT THE DATA SCANNER
		teclado = new Scanner(System.in);
        		
       	boolean salir = false;
        int opcion;
        
		double numero1, numero2, resultado=0;
		double factorial = 1;
		
		String ANSI_RED_BACKGROUND = "\u001B[41m";
		String ROJO = "\u001B[1;31m";
		String NORMAL = "\u001B[0m";
		String AMARILLO = "\u001B[1;33m";
		String VERDE = "\u001B[1;32m";
		String AZUL = "\u001B[1;34m";
		String NEGRITA = "\u001B[1m";
		String AZULETE = "\u001B[1;36m";
		
      while (!salir) {
    	//CLEAN
    	System.out.print("\033[H\033[2J");
    	System.out.flush();
    try {
        System.out.println("CALCUTESTER v2.0\n\n");
        System.out.println("Vamos a empezar introduciendo los digitos, pueden ser enteros o decimales:");
        
        System.out.print("Por favor introduzca el primer operando: ");			
        numero1 = teclado.nextDouble();
        
        System.out.print("A continuación introduzca el segundo operando: ");
		numero2 = teclado.nextDouble();
	      
	      
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        "+AZUL+"¿Qué operación deseas realizar?"+NORMAL+"                              ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃        Pulsa 1 si deseas realizar una suma                          ┃");
        System.out.println("┃        Pulsa 2 si deseas realizar una resta                         ┃");
        System.out.println("┃        Pulsa 3 si deseas realizar una multiplicación                ┃");
        System.out.println("┃        Pulsa 4 si deseas realizar una división                      ┃");
        System.out.println("┃        Pulsa 5 si deseas realizar una potencia                      ┃");
        System.out.println("┃        Pulsa 6 si deseas realizar una raíz                          ┃");
        System.out.println("┃        Pulsa 7 si deseas realizar una operacion factorial           ┃");
        System.out.println("┃        Pulsa 8 si deseas realizar un logaritmo                      ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃        Pulsa 0 si deseas salir                                      ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            
          
    
    	
     
      System.out.print("|            Escribe una de las opciones: ");
      opcion = teclado.nextInt();
      System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
  
   switch (opcion) {
	
    case 1: //ADDITION
    	  resultado = numero1+numero2;
    	  System.out.println("El resultado de la operación es: " + resultado);
    	
    break;
		 
    case 2: //SUBTRACTION
    	  resultado = numero1-numero2;
    	  System.out.println("El resultado de la operación es: " + resultado);
	break;
		 
    case 3: //MULTIPLICATION
    	  resultado = numero1*numero2;
    	  System.out.println("El resultado de la operación es: " + resultado);
    break;
		 
    case 4: //DIVISION
    	  if (numero2 !=0) {
			resultado = numero1/numero2;
    	    System.out.println("El resultado de la operación es: " + resultado);}
    	  else 
			System.out.println("No es posible realizar la division por 0.\n");
    break;
		 
    case 5: //POWERS
    	  resultado= Math.pow(numero1, numero2);
    	  System.out.println("El resultado de la operación es: " + resultado);
    break;
		 
    case 6: //SQUARE ROOTS
    	  System.out.println("Raiz cuadrada de (" + numero1 + ")=" + Math.sqrt(numero1));
      	  System.out.println("Raiz cuadrada de (" + numero2 + ")=" + Math.sqrt(numero2));
	break;
		 
	case 7: //FACTORIAL
		System.out.println("Se procedera a calcular el factorial del primer numero...");
		while ( numero1!=0) {
  			factorial=factorial*numero1;
  			numero1--;
		}
		resultado=factorial;
		System.out.println("El resultado de la operación es: " + resultado);
		break;
		 
		 
	case 8:	//LOGARITHM
		System.out.println("Vamos a calcular el logaritmo del primer numero");
		System.out.print("Por favor introduzca la base deseada: ");
		int base=teclado.nextInt();
		resultado =(Math.log(numero1)/Math.log(base));
		System.out.println("El resultado de la operación es: " + resultado);
	break;
		
	case 0: //EXIT
		System.out.println("Gracias por utilizar nuestra calculadora");
		salir=true;
	break;
		 
	default:System.out.println("Introduzca una opción de las anteriores, por favor");
	break;
		 
   }//END SWITCH
   } catch (InputMismatchException e) {
	   System.out.println("|\t      Tienes que insertar un número\n");
	   teclado.next();
	   System.out.print("|\t      Presiona la tecla Enter para continuar");
	   teclado.nextLine();
	 } 
   
      System.out.print("|     Presiona la tecla Enter para continuar");
      teclado.nextLine(); 
  
	}
	}
}