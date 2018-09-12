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
public class Triangulo extends Figura{


    public int CalcularArea(int base,int altura) {
        int area= (base*altura)/2;
        return area;
        
    }


    public int CalcularPerimetro(int ladoA,int ladoB,int ladoC) {
        int perimetro= ladoA+ladoB+ladoC;
        return perimetro;
    }
    
    
  
}
