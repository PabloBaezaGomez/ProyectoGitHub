/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * En la clase calculadora, hay cuatro metodos que realizan la suma, resta,
 * multiplicacion y division de los dos float dados
 *
 * @author DAW2
 * @version 1.0
 */
public class Calculadora {

    private float numA;
    private float numB;

    /**
     * Crea un objeto calculadora con los valores de numA y numB
     *
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     */
    public Calculadora(float numA, float numB) {
        //Establece ambos valores como las variables del objeto
        this.numA = numA;
        this.numB = numB;
    }

    /**
     * Realiza la suma de dos float y devuelve el resultado de la suma
     *
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     * @return [Suma float de ambos numeros]
     */
    public float sumar(float numA, float numB) {
        return numA + numB;
    }

    /**
     * Realiza la resta de dos float y devuelve el resultado de la resta
     *
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     * @return [Resta float de ambos numeros]
     */
    public float restar(float numA, float numB) {
        return numA - numB;
    }

    /**
     * Realiza la multiplicacion de dos float y devuelve el resultado de la
     * multiplicacion
     *
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     * @return [Producto float de ambos numeros]
     */
    public float multiplicar(float numA, float numB) {
        return numA * numB;
    }

    /**
     * Realiza la division de dos float y devuelve el resultado de ella
     *
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     * @throws ArithmeticException [Comprueba que el numB no sea igual a 0, para
     * evitar el error de dividir entre 0]
     * @return [Cociente float de la division de ambos numeros]
     */
    public float dividir(float numA, float numB) {
        if (numB == 0) {
            throw new ArithmeticException("NO DIVIDAS POR 0");
        }
        return numA / numB;
    }

    /**
     * Calcula la potencia numB de numA
     *
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     * {@link #multiplicar(float, float)} [llama al metodo multiplicar para
     * calcular la potencia]
     * @return [Devuelve el resultado de multiplicar numA un numero numB de
     * veces]
     */
    public float calcularPotencia(float numA, float numB) {
        float numInicial = 1;
        for (int i = 0; i < numB; i++) {
            numInicial = multiplicar(numInicial, numA);
        }
        return numInicial;
    }

    /**
     * Calcula la media de los dos numeros A y B
     * @param numA [Primer numero introducido]
     * @param numB [Segundo numero introducido]
     * @return [Devuelve un float con la media de ambos numeros]
     */
    public float calcularPromedio(float numA, float numB){
        float promedio = (numA + numB)/2;
        return promedio;
    }
}
