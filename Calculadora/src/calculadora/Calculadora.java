
package calculadora;
import calculadora.Operaciones;
import java.util.Scanner;

public class Calculadora {    

    public static void main(String[] args) {
        Operaciones oper = new Operaciones();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero");
        oper.setNumero1(sc.nextInt());
        System.out.println("Ingrese segundo numero");
        oper.setNumero2(sc.nextInt());
        oper.Sumar();
        System.out.println("La Suma es: "+oper.getResultado());
        oper.Resta();
        System.out.println("La Resta es: "+oper.getResultado());
        oper.Multiplicacion();
        System.out.println("La Multiplicacion es: "+oper.getResultado());
        oper.Division();        
    }    
}
