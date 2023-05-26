/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enprueba1buena;

/**
 *
 * @author skril
 */
public class ENPrueba1BUENA {

    public  int calcularResultado(int a, int b, String operador) { /* ES MUY IMPORTANTE NO HACER EL METODO STATIC PORQUE SINO NO PASARA POR LA LINEA  public class ENPrueba1BUENA { y no nos dara todo el coverage, entonces cuando NO ES static al crear la test class se crea una instancia de caluclarResultado y crea un objeto en cada test*/
        int resultado = 0;
        
        if (operador.equals("+")) {
            if (a > 0 && b > 0) {
                resultado = a + b;
            } else if (a < 0 && b < 0) {
                resultado = a - b;
            }
        } else if (operador.equals("-")) {
            if (a > b) {
                resultado = a - b;
            } else if (a < b) {
                resultado = b - a;
            } else {
                resultado = 0;
            }
        } else if (operador.equals("*")) {
            if (a == 0 || b == 0) {
                resultado = 0;
            } else {
                resultado = a * b;
            }
        } else if (operador.equals("/")) {
            if (b != 0) {
                resultado = a / b;
            } else {
                System.out.println("División por cero no permitida");
            }
        } else {
            System.out.println("Operador no válido");
        }
        
        return resultado;
    }
}
