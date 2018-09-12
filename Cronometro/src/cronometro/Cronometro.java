/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;
import cronometro.Tiempo;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 80b785a6dea27b580a88295f106beec5537d0ebe
/**
 *
 * @author Rapter
 */
public class Cronometro {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
    public static void main(String[] args)throws InterruptedException {
        Tiempo time = new Tiempo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opción de su elección: ");
        System.out.println("1. Iniciar desde cero hacia adelante ");
        System.out.println("2. Iniciar desde cero hacia atras ");
       // System.out.println("3. Iniciar desde cero hasta un numero indicado y luego retroceder ");
    // System.out.println("4. Iniciar desde un tiempo en especifico "); 
       // System.out.println("3. Iniciar de manera regresiva desde un tiempo en especifico ");   
       // System.out.println("4. Iniciar y detener en... ");
        int option=sc.nextInt();
        
        switch (option) {
            case 1:  time.Iniciar();
                     break;
            case 2: time.Reversa();
                    break;
            case 3:  
                    System.out.println("Ingrese Hora: ");
                    int h=sc.nextInt();
                    System.out.println("Ingrese Minuto: ");
                    int m=sc.nextInt();
                    System.out.println("Ingrese Segundo: ");
                    int s=sc.nextInt();
                    time.Reanudar(h, m, s);
                     break;            
            default: 
                     break;
        }
        
=======
    public static void main(String[] args) {
        Tiempo time = new Tiempo();
        time.Iniciar();
>>>>>>> 80b785a6dea27b580a88295f106beec5537d0ebe
        
    }
    
}
