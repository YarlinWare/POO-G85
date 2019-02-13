/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;


/**
 *
 * @author rapterpakfa
 */
public class Recorrido {
    

    public void Recorrido_matriz(int tamanio_matriz) {
        int a=0;
        int b=tamanio_matriz-1;
        int valor=1;
        String [][] matriz= new String[tamanio_matriz][tamanio_matriz];
        
        for (int j = 0; j < matriz.length; j++) {
            //Llenamos la fila superior
            for (int i = a; i <= b; i++) {
                matriz[a][i]=(valor++) + "";
            }
            //Llenamos columna extremo derecho
            for (int i = (a+1); i <= b; i++) {
                matriz[i][b]=(valor++) + "";
            }
            //Llenamos la fila inferior
            for (int i = (b-1); i >=a; i--) {
                matriz[b][i]=(valor++) + "";
            }
            //Llenamos columna extremo izquierdo
            for (int i = (b-1); i >= (a+1); i--) {
                matriz[i][a]=(valor++) + "";
            }
            a++;
            b--;
        }
        for (int h = 0; h < matriz.length; h++) {
            for (int k = 0; k < matriz[h].length; k++) {
                System.out.print(matriz[h][k]+"\t");
            }
                System.out.println("\n");
        }
        
        
        
    }

    
    
    
}
