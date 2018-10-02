/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasbasicas1;
import Logica.*;
import java.util.Scanner;

/**
 *
 * @author Rapter
 */
public class FigurasBasicas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese segun su eleccion");
        System.out.println("Calcular area y perimetro de:");
        System.out.println("1. Circulo.");
        System.out.println("2. Cuadrado.");
        System.out.println("3. Rectangulo.");
        System.out.println("4. Triangulo.");
        System.out.print("Opcion: ");
        int numero =sc.nextInt();
        switch (numero) {
            case 1:  
                Circulo circulo = new Circulo();
                System.out.println("ingrese radio: ");
                int radio =sc.nextInt();
                System.out.println("El area del circulo es de "+ 
                        circulo.CalcularArea(radio));
                System.out.println("El perimetro del circulo es de "+ 
                        circulo.CalcularPerimetro(radio));
                    break;
            case 2:  
                Cuadrado cuadrado = new Cuadrado();
                System.out.println("ingrese tamaño del lado: ");
                int lado =sc.nextInt();
                System.out.println("El area del cuadrado es de "+
                        cuadrado.CalcularArea(lado));
                System.out.println("El perimetro del cuadrado es de "+
                        cuadrado.CalcularPerimetro(lado));
                    break;
            case 3:  
                Rectangulo rectangulo = new Rectangulo();
                System.out.println("ingrese tamaño del lado 1: ");
                int lado1 =sc.nextInt();
                System.out.println("ingrese tamaño del lado 2: ");
                int lado2 =sc.nextInt();
                System.out.println("El area del rectangulo es de "+
                        rectangulo.CalcularArea(lado1,lado2));
                System.out.println("El perimetro del rectangulo es de "+
                        rectangulo.CalcularPerimetro(lado1,lado2));
                break;
            case 4:  
                Triangulo triangulo = new Triangulo();
                System.out.println("ingrese tamaño de la base: ");
                int base =sc.nextInt();
                System.out.println("ingrese tamaño de la altura: ");
                int altura =sc.nextInt();
                System.out.println("El area del cuadrado es de "+
                        triangulo.CalcularArea(base,altura));
                System.out.println("ingrese tamaño del lado 1: ");
                int ladoa =sc.nextInt();
                 System.out.println("ingrese tamaño del lado 2: ");
                int ladob =sc.nextInt();
                System.out.println("ingrese tamaño del lado 3: ");
                int ladoc =sc.nextInt();
                System.out.println("El perimetro del cuadrado es de "+
                        triangulo.CalcularPerimetro(ladoa,ladob,ladoc));
                break;
            default: 
                System.out.println("No se reconoce opcion.");
                    break;
        }
                
                
    }
    
}
