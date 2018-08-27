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
public class CalculadoraDecimal extends Calculadora{
    public CalculadoraDecimal() {
        this.base = 10;
    }
    
    @Override
    public String mostrarResultado(){
        return String.valueOf(super.getResultado());
    }
    
    @Override
    public String mostrarValor1() {
        return String.valueOf(super.getValor1());
    }

    @Override
    public String mostrarValor2() {
        return String.valueOf(super.getValor2());
    }
}
