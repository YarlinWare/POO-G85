/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;
import Archivos.Archivos;
import Logica.Recorrido;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import static java.awt.image.ImageObserver.ABORT;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rapterpakfa
 */
public class Caracol extends JPanel {           
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        Recorrido rec = new Recorrido();
        Archivos arch = new Archivos();
        
        rec.imprimirMatriz(5);
        arch.escribir(5);
    }
    
}
