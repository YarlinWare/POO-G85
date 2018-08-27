/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author Estudiantes
 */
public class CalculadoraBinaria extends Calculadora{
    
    public CalculadoraBinaria() {
        this.base = 2;
    }
    
    @Override
    public String mostrarResultado(){
        return Integer.toBinaryString(super.getResultado());
    }
    
    @Override
    public String mostrarValor1() {
        return Integer.toBinaryString(super.getValor1());
    }

    @Override
    public String mostrarValor2() {
        return Integer.toBinaryString(super.getValor2());
    }
    
    
    
}
