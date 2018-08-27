
package calculadora;
import calculadora.logica.CalculadoraBinaria;
import calculadora.logica.CalculadoraDecimal;
import calculadora.logica.CalculadoraHexadecimal;
import calculadora.logica.CalculadoraOctal;
import calculadora.Operaciones;
import calculadora.logica.Calculadora;
import java.util.Scanner;

public class Principal {    

    public static void main(String[] args) {
        Operaciones oper = new Operaciones();
        Scanner sc = new Scanner(System.in);
        Calculadora c;
        
        System.out.println("Ingrese la base que desea: ");
        int base = sc.nextInt();
        switch(base){
            case 2:
              c = new CalculadoraBinaria();
              break;
            case 8:
                c = new CalculadoraOctal();
                break;
            case 10:
                c = new CalculadoraDecimal();
                break;
            default:
                c = new CalculadoraHexadecimal();
                break;
        }
        System.out.println("Ingrese un entero");
        c.setValor1(sc.next());
        System.out.println("Ingrese otro entero");
        c.setValor2(sc.next());
        c.sumar();
        System.out.println(c.mostrarValor1() + " + " + c.mostrarValor2() + " = " + c.mostrarResultado());
        c.restar();
        System.out.println(c.mostrarValor1() + " - " + c.mostrarValor2() + " = " + c.mostrarResultado());
        c.multiplicar();
        System.out.println(c.mostrarValor1() + " * " + c.mostrarValor2() + " = " + c.mostrarResultado());
        c.dividir();
        /*System.out.println(c.mostrarValor1() + " / " + c.mostrarValor2() + " = " + c.mostrarResultado());
        
        /*System.out.println("Ingrese primer numero");
        oper.setNumero1(sc.nextInt());
        System.out.println("Ingrese segundo numero");
        oper.setNumero2(sc.nextInt());
        oper.Sumar();
        System.out.println("La Suma es: "+oper.getResultado());
        oper.Resta();
        System.out.println("La Resta es: "+oper.getResultado());
        oper.Multiplicacion();
        System.out.println("La Multiplicacion es: "+oper.getResultado());
        oper.Division();     */
    }    
}
