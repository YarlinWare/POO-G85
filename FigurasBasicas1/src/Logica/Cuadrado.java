/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Rapter
 */
public class Cuadrado extends Figura{


   public int CalcularArea(int lado) {
        int area = lado*lado; 
        return area;
        
    }

    public int CalcularPerimetro(int lado) {
        int perimetro = 4*lado; 
        return perimetro;
    }
    
}
