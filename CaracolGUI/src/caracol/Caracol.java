/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;
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
        Rectangulo rect_1 = new Rectangulo(this);
        
    /**
     * @param args the command line arguments
     */
    public Caracol() {
        this.rect_1 = new Rectangulo(this);
    }
        
    private void move() {
            rect_1.move();
    }
    @Override
    public void paint(Graphics g) {
            //super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
            rect_1.paint(g2d);
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }
    public static void main(String[] args) throws InterruptedException {
            Recorrido rec = new Recorrido();
            rec.Recorrido_matriz(5);
            JFrame frame = new JFrame("Caracol");
            Caracol game = new Caracol();
            frame.add(game);
            frame.setSize(300, 400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            while (true) {
                game.move();
                game.repaint();
                Thread.sleep(10);
            }
    }
    
}
