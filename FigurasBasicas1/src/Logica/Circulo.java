/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.math.*;
/**
 *
 * @author Rapter
 */
public class Circulo extends Figura{
    
    public float CalcularArea(int radio) {
        float area = (float) ((Math.PI)*(radio*radio)); 
        return area;
        
    }

    public float CalcularPerimetro(int radio) {
        float perimetro = (float) (2*(Math.PI)*(radio)); 
        return perimetro;
    }
    
}
