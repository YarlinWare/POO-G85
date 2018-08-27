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
public abstract class Calculadora {
    protected int valor1;
    protected int valor2;
    protected int resultado;
    protected int base;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public abstract String mostrarResultado();
    
    public abstract String mostrarValor1();
    
    public abstract String mostrarValor2();
    
    public void setValor1(String valor){
        this.setValor1(Integer.parseInt(valor, this.base));
    }
    
    public void setValor2(String valor){
        this.setValor2(Integer.parseInt(valor, this.base));
    }
    
    public void sumar(){
        this.resultado = this.valor1 + this.valor2;
    }
    
    public void restar(){
        this.resultado = this.valor1 - this.valor2;
    }
    
    public void multiplicar(){
        this.resultado = this.valor1 * this.valor2;
    }
    
    public void dividir(){
        if(this.valor1==0){
            this.resultado=0;
            System.out.println("La Division es: " + this.resultado);
        }else if(this.valor2==0){
            System.out.println("Division Nula, no se puede realizar ");
        }else{
            this.resultado=this.valor1/this.valor2; 
            /*System.out.println("La Division es: " + this.resultado);*/
            System.out.println(this.valor1 + " / " + this.valor2 + " = " + this.resultado);

        }
    }
    
    
}
