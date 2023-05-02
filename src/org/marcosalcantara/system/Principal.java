/*
* Copyright (C) 2021 Marcos Alcantara Hernandez
 */
package org.marcosalcantara.system;

import java.util.Scanner;

/**
 * @author Marcos Alcantara Hernandez
 * @date 03/03/2022
 *
 * Codigo tecnico: IN5BV Grupo: 1 (Jueves) Carne: 2021332
 *
 */

/*
Se desea construir un programa en JAVA que utilice los conceptos de programación orientada a objetos vistos en 
clase (Clases, Objetos, Métodos, Parámetros, Variables de Instancia) que permita calcular el área y el perímetro 
de distintas figuras geométricas.
 */
import org.marcosalcantara.bean.Circulo;
public class Principal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int opcion;

        //Menu
            System.out.println("Calculadora Area y Perimetro\n");
        
            System.out.println("------- Menu -------");
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Trapecio");
            System.out.println("4. Salir");
            System.out.println("\n");

            System.out.println("Elige una opcion");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    int primerDato = 0;
                    
                    System.out.println("Ingrese el Radio del Circulo a calcular: ");
                    primerDato = sn.nextInt();
                    
                    Circulo cr = new Circulo(primerDato);
                    double resultadoCirculo = cr.circulo();
                    
                    double resultadoAreas = cr.circuloAreas();
  
                    System.out.println("El Perimetro del Circulo es: " + resultadoCirculo);
                    System.out.println("El Area del Circulo es: " + resultadoAreas);
                    
                    
                    break;
                case 2:
                    System.out.println("Hola elegiste la opcion 2");
                    break;
                case 3:
                    System.out.println("Hola elegiste la opcion 3");
                    break;
                case 4:
                    System.out.println("Hola elegiste la opcion , Salir");
                    
                    break;
     
            }
 
    }
}
