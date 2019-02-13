/*
 * Clase para leer y escribir archivos
 */
package Archivos;

import Logica.Recorrido;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author rapterpakfa
 */
public class Archivos {
    private static String FILE_NAME = "MatrizCaracol.txt";    
    int [][]matriz;
    
    Recorrido rec = new Recorrido();
    
    public void escribir(int tamanio){
        matriz = rec.Recorrido_matriz(tamanio);
        File archivo = new File("..\\Archivos\\txt\\Caracol.txt");
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
    public void leer(){
        
    }
}
