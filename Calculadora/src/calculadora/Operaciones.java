
package calculadora;


public class Operaciones {
    private int numero1;
    private int numero2;
    private int resultado;
    
    public void setNumero1(int valor ){
        this.numero1=valor;
    }
    public void setNumero2(int valor ){
        this.numero2=valor;
    }

    public int getResultado() {
        return resultado;
    }
    
    public void Sumar(){
        this.resultado=this.numero1+this.numero2;
    }
    public void Resta(){
        this.resultado=this.numero1-this.numero2;
    }
    public void Multiplicacion(){          
        this.resultado=this.numero1*this.numero2;
    }
    public void Division(){
        if(this.numero1==0){
            this.resultado=0;
            System.out.println("La Division es: " + this.resultado);
        }else if(this.numero2==0 && this.numero1!= 0){
            System.out.println("Division Nula, no se puede realizar ");
        }else{
            this.resultado=this.numero1/this.numero2; 
            System.out.println("La Division es: " + this.resultado);
        }   
    }
}
