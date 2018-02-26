/**
*
* @author Eric Martin / Jesus Calderon
* @version 1.0
*/

import java.util.*;
import java.lang.Math;

public class main {

	//WE IMPORT THE DATA SCANNER
	Scanner teclado = new Scanner(System.in);
	Scanner waitForKeypress = new Scanner(System.in);
	
	public static void intronumeros(double numero1, double numero2, Scanner teclado) {
		
        System.out.print("Por favor introduzca el primer operando: ");			
        numero1 = teclado.nextDouble();
        
        System.out.print("A continuación introduzca el segundo operando: ");
		numero2 = teclado.nextDouble();
	}

	public static void main(String[] args)  {
		


        		
       	boolean salir = false;
        int opcion;
        
		double resultado;
		//numero1 = 0, numero2 = 0, 
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
    	
        System.out.println("CALCUTESTER v1.0\n\n");
        System.out.println("Vamos a empezar introduciendo los digitos, pueden ser enteros o decimales:");
        

	      
	      
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
	
      case 1:
    	  intronumeros(numero1, numero2, teclado);
    	  resultado = numero1+numero2;
    	  System.out.println("El resultado de la suma es " + resultado);
      break;
		 
      case 2:
    	  resultado = numero1-numero2;
    	  System.out.println("El resultado de la resta es " + resultado);
	  break;
		 
      case 3:
    	  resultado = numero1*numero2;
      break;
		 
      case 4: 
    	  if (numero2 !=0)
			resultado = numero1/numero2;
    	  else 
			System.out.println("No es posible realizar la division por 0.\n");
      break;
		 
      case 5:
    	  resultado= Math.pow(numero1, numero2);
      break;
		 
      case 6: 
    	  System.out.println("Raiz cuadrada de (" + numero1 + ")=" + Math.sqrt(numero1));
      	  System.out.println("Raiz cuadrada de (" + numero2 + ")=" + Math.sqrt(numero2));
	  break;
		 
	case 7: System.out.println("Se procedera a calcular el factorial del primer numero...");
		while ( numero1!=0) {
  			factorial=factorial*numero1;
  			numero1--;
		}
		resultado=factorial;
		break;
		 
		 
	case 8:	 /*(Math.log(num)/Math.log(2));*/
		 break;
		
	case 0: System.out.println("Gracias por utilizar nuestra calculadora");
		salir=true;
		break;
		 
	default:System.out.println("Introduzca una opción de las anteriores, por favor");
		break;
		 
	}//fin switch
    
      System.out.print("|     Presiona la tecla Enter para continuar");
      waitForKeypress.nextLine(); 
	
    
	}
}
}