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
public class Rectangulo extends Figura{

    public int CalcularArea(int ladoA, int ladoB) {
        int area = ladoA*ladoB; 
        return area;
        
    }

    public int CalcularPerimetro(int ladoA, int ladoB) {
        int perimetro = (2*ladoA)+(2*ladoB); 
        return perimetro;
    }
    
}
