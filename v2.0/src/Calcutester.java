import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.lang.Math;

/**
 * Tests para la clase principal (main)
 *
 * @author Eric Martin 
 * @author Jesus María Calderón
 * @version 2.0
 */


public class Calcutester {


	double numero1, numero2, resultado=0;
	
 	Calculadora calculadora;

    /**
     * Crea una instancia de {@link Calculadora}
     *
     * @throws Exception
     */
    	@org.junit.Before
    	public void setUp() {
        	calculadora = new Calculadora();
    	}	

    	@org.junit.After
    	public void tearDown() {
    	}


    /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaSumaTOP1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4,5;
		resultado=numero1+numero2;
	}

   /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaSumaTOP2(){
  		numero1=5,7;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1+numero2;
	}

  /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaSumaBOTTOM1(){
		numero1=-Double.MAX_VALUE;
   		numero2=7,5;
		resultado=numero1+numero2;
	}
   /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaSumaBOTTOM2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1+numero2;

     /**
     * 
     *Comprueba que la Calculadora realiza sumas correctamente
     *
     */

    @Test 
	public void pruebaSumaNormal() {
	      	numero1=3,9;
	   	numero2=4,7;
		resultado=numero1+numero2;

	}

     /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaRestaTOP1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4,5;
		resultado=numero1-numero2;
	}

     /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaRestaTOP2(){
  		numero1=5,7;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1-numero2;
	}

   /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaRestaBOTTOM1(){
		numero1=-Double.MAX_VALUE;
   		numero2=7,5;
		resultado=numero1-numero2;
	}
   /**
     * Comprueba la operacion resta y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaRestaBOTTOM2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1-numero2;

	}
    /**
     * 
     *Comprueba que la Calculadora realiza restas correctamente
     *
     */

    @Test 
	public void pruebaRestaNormal() {
      		numero1=3,9;
   		numero2=4,7;
		resultado=numero1-numero2;

    	}


     /**
     * Comprueba la operacion multiplicacion y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaProductoTOP1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4,5;
		resultado=numero1*numero2;
	}

     /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaProductoTOP2(){
  		numero1=5,7;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1*numero2;
	}

   /**
     * Comprueba la operacion suma y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaProductoBOTTOM1(){
		numero1=-Double.MAX_VALUE;
   		numero2=7,5;
		resultado=numero1*numero2;
	}
   /**
     * Comprueba la operacion multiplicacion y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaProductoBOTTOM2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1*numero2;

	}

    /**
     * 
     *Comprueba que la Calculadora realiza multiplicaciones correctamente
     *
     */

    @Test 
	public void pruebaProductoNormal() {
      	numero1=3,9;
   	numero2=4,7;
	resultado=numero1*numero2;

    }

    /**
     * Realiza una prueba para comprobar que la Calculadora realiza multiplicaciones con 0
     *
     */

    @Test
    	public void pruebaProductoCero() {
	numero1=0,0;
   	numero2=4,7;
	resultado=numero1*numero2;

       
    }


     /**
     * Comprueba la operacion division y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaDivisionTOP1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4,5;
		resultado=numero1/numero2;
	}

     /**
     * Comprueba la operacion division y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaDivisionTOP2(){
  		numero1=5,7;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1/numero2;
	}

   /**
     * Comprueba la operacion division y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el primer operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaDivisionBOTTOM1(){
		numero1=-Double.MAX_VALUE;
   		numero2=7,5;
		resultado=numero1/numero2;
	}

   /**
     * Comprueba la operacion division y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double en el segundo operando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaDivisionBOTTOM2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1/numero2;

	}

    /**
     * 
     *Comprueba que la Calculadora realiza divisiones correctamente
     *
     */

    @Test 
	public void pruebaDivisionNormal() {
      	numero1=39;
   	numero2=4,7;
	resultado=numero1/numero2;

    }

    /**
     *
     * Realiza una prueba para comprobar que la Calculadora realiza divisiones con 0
     *
     */

    @Test
    	public void pruebaProductoCero() {
	numero1=0,0;
   	numero2=4,7;
	resultado=numero1/numero2;

       
    }


    /**
     * Comprueba la operacion potencia y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double para la base
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaPotenciaBase1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4;
		resultado=numero1^numero2;
	}

     /**
     * Comprueba la operacion potencia y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double para el exponente
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaPotenciaExponente1(){
  		numero1=5,7;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1^numero2;
	}

     /**
     * Comprueba la operacion potencia y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para la base
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaPotenciaBase2(){
		numero1=-Double.MAX_VALUE;
   		numero2=7,5;
		resultado=numero1^numero2;
	}
   /**
     * Comprueba la operacion potencia y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para el exponente
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaPotenciaExponente2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1^numero2;

	}

    /**
     * 
     *Comprueba que la Calculadora realiza potencias correctamente
     *
     */

    @Test 
	public void pruebaPotenciaNormal() {
      	numero1=3;
   	numero2=4;
	resultado=numero1^numero2;

    }

    /**
     * Realiza una prueba para comprobar que la Calculadora realiza potencias con exponente 0
     *
     */

    @Test
    	public void pruebaPotenciaCero() {
	numero1=5;
   	numero2=0;
	resultado=numero1^numero2;

    }

    /**
     * Comprueba la operacion raiz y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double para la base
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaRaizBase1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4;
		resultado=numero1.sqrt(numero2);
	}


     /**
     * Comprueba la operacion raiz y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para la base
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaRaizBase2(){
		numero1=-Double.MAX_VALUE;
   		numero2=4;
		resultado=numero1.sqrt(numero2);
	}



     /**
     * Comprueba la operacion potencia y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double para el radicando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaRaizRadicando1(){
  		numero1=3,9;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1.sqrt(numero2);

	}
    
   /**
     * Comprueba la operacion potencia y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para el radicando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaRaizRadicando2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1.sqrt(numero2);

	}

    /**
     * 
     *Comprueba que la Calculadora realiza raices correctamente
     *
     */

    @Test 
	public void pruebaRaizNormal() {
      	numero1=3;
   	numero2=4;
	resultado=numero1.sqrt(numero2);

    }


    /**
     * Comprueba la operacion logaritmo y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double para la base
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaLogBase1(){
		numero1=Double.MAX_VALUE+1;
   		numero2=4;
		resultado=numero1.log(numero2);
	}


     /**
     * Comprueba la operacion logaritmo y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para la base
     *
     */

    @Test(expected = IllegalArgumentException.class)
  	public void pruebaLogBase2(){
		numero1=-Double.MAX_VALUE;
   		numero2=4;
		resultado=numero1.log(numero2);
	}

     /**
     * Comprueba la operacion logaritmo y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double para el argumento
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebalogArgumento1(){
  		numero1=3,9;
   		numero2=Double.MAX_VALUE+1;
		resultado=numero1.log(numero2);

	}
    
   /**
     * Comprueba la operacion logaritmo y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para el radicando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaLogArgumento2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
		resultado=numero1^numero2;

	}

    /**
     * 
     *Comprueba que la Calculadora realiza logaritmos correctamente
     *
     */

    @Test 
	public void pruebaLogNormal() {
      	numero1=3;
   	numero2=4;
	resultado=numero1.log(numero2);

    }

    
     /**
     * Comprueba la operacion factorial y falla frente al desbordamiento al usar
     * un numero superior al maximo permitido en un double
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaFactorial1(){
  		numero1=3,9;
   		numero2=Double.MAX_VALUE+1;
	}
    
   /**
     * Comprueba la operacion factorial y falla frente al desbordamiento al usar
     * un numero inferior al maximo permitido en un double para el radicando
     *
     */

    @Test(expected = IllegalArgumentException.class)
	public void pruebaFactorial2(){
  		numero1=3,9;
   		numero2=-Double.MAX_VALUE;
	}


    /**
     * Realiza una prueba para comprobar que la Calculadora realiza factoriales correctamente
     *
     *
     */
    @Test
    public void pruebaFactorial() {
        numero1=4;
   	numero2=8;
    }

}
