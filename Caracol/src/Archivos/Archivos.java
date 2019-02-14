/*
 * Clase para leer y escribir archivos
 */
package Archivos;

import Logica.Recorrido;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author rapterpakfa
 */
public class Archivos {   
    int [][]matriz;
    
    Recorrido rec = new Recorrido();
    
    public void escribir(int tamanio){
        matriz = rec.Recorrido_matriz(tamanio);
        File archivo = new File("Caracol.txt");
        File archivoLinux = new File("/home/Usuario/NetBeansProjects/Caracol/src/Archivos/txt/Caracol.txt");
        
        try {
            FileWriter write = new FileWriter(archivo);            
            PrintWriter escribir = new PrintWriter(write);
            
            for (int h = 0; h < matriz.length; h++) {
                for (int k = 0; k < matriz[h].length; k++) {
                    escribir.append(matriz[h][k]+"\t");
                }
                escribir.println();
            } 
            escribir.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void leer() throws FileNotFoundException, IOException{
        String cadena;
        File archivo = new File("Caracol.txt");
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);          
        }      
        b.close();        
    }
}
