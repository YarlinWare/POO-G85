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
public class CalculadoraHexadecimal extends Calculadora{
    public CalculadoraHexadecimal() {
        this.base = 16;
    }
    
    @Override
    public String mostrarResultado(){
        return Integer.toHexString(super.getResultado());
    }
    
    @Override
    public String mostrarValor1() {
        return Integer.toHexString(super.getValor1());
    }

    @Override
    public String mostrarValor2() {
        return Integer.toHexString(super.getValor2());
    }
}
