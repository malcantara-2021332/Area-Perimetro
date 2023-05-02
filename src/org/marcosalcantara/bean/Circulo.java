/*
* Copyright (C) 2021 Marcos Alcantara Hernandez
*/
package org.marcosalcantara.bean;

/**
 * @author Marcos Alcantara Hernandez
 * @date 03/03/2022
 * 
 * Codigo tecnico: IN5BV
 * Grupo: 1 (Jueves)
 * Carne: 2021332
 * 
 */

/*
Triangulo
Se desea construir un programa en JAVA que utilice los conceptos de programación orientada a objetos vistos en 
clase (Clases, Objetos, Métodos, Parámetros, Variables de Instancia) que permita calcular el área y el perímetro 
de distintas figuras geométricas.
 */
public class Circulo {
    //Atributos
    int radio;
    double perimetro,area;
    double pi = 3.1416;   
    
    //Constructor nulo
    public Circulo() {

    }
    
    //Constructor con parametros
    public Circulo(int radio) {
        this.radio = radio;
        this.perimetro = perimetro;
        this.area = area;
    }
    
    //Metodos
    public double circulo(){
        this.perimetro = 2*3.1416*this.radio;
        return this.perimetro;
        
    
    }
    
   public double circuloAreas(){
        this.area = 3.1416*this.radio*this.radio;
        return this.area;
   }
}
