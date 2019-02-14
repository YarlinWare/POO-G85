/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;
import Archivos.Archivos;
import Logica.Recorrido;
import java.io.IOException;
import javax.swing.JPanel;
import java.util.Scanner;
/**
 *
 * @author rapterpakfa
 */
public class Caracol extends JPanel {           
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) throws IOException {
        Recorrido rec = new Recorrido();
        Archivos arch = new Archivos();  
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca Tamaño de la Matriz: \n");       
        int tamanio = sc.nextInt(); 
        /* Creando la matriz */ 
        System.out.print("****** Método de creación de la matriz ******\n"); 
        rec.imprimirMatriz(tamanio);
        /* Creación y lectura archivo */
        System.out.println("****** Lectura del Archivo ******\n"); 
        arch.escribir(tamanio);
        arch.leer();
    }   
    
}
