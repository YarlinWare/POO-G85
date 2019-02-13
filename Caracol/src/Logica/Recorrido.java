/*
 * Clase encargada de estabecer el recorrido de la matriz
 */
package Logica;


/**
 *
 * @author rapterpakfa
 */
public class Recorrido {
    
    /* Método para el recorrido en forma de Caracol */
    public int[][] Recorrido_matriz(int tamanio_matriz) {
        int x=0;
        int y=tamanio_matriz-1;
        int valor=1;
        int [][] matriz= new int[tamanio_matriz][tamanio_matriz];
        
        for (int j = 0; j < matriz.length; j++) {
            for (int i = x; i <= y; i++) {
                matriz[x][i]=(valor++);
            }
            for (int i = (x+1); i <= y; i++) {
                matriz[i][y]=(valor++);
            }
            for (int i = (y-1); i >=x; i--) {
                matriz[y][i]=(valor++);
            }
            for (int i = (y-1); i >= (x+1); i--) {
                matriz[i][x]=(valor++);
            }
            x++;
            y--;
        }
        return matriz;
    }
    /* Método para imprimir la matriz por consola */
    public void imprimirMatriz(int tamanio){        
        int [][] matriz= Recorrido_matriz(tamanio);
        for (int h = 0; h < matriz.length; h++) {
            for (int k = 0; k < matriz[h].length; k++) {
                System.out.print(matriz[h][k]+"\t");
            }
            System.out.println("\n");
        } 
    }
    
}
