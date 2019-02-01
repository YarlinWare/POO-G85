/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colision;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.awt.Rectangle;
/**
 *
 * @author Estudiantes
 */
public class Rectangulo2 extends JPanel {
    /*private static final int Y = 330;*/
    private static final int WITH = 30;
    private static final int HEIGHT = 60;
    int x = (int) (Math.random() * 300) + 1;;
    int y = (int) (Math.random() * 300) + 1;;
    int xa = 1;
    int ya = 1;
    private Colision game;
    
    //private Colision game;

    public Rectangulo2(Colision game) {
        this.game= game;
    }
/*
    Rectangulo2(Colision aThis) {
        this.game = game;
    }*/
    void move() {
        if (x + xa < 0)
                xa = 1;
        if (x + xa > game.getWidth() - 30)
                xa = -1;
        if (y + ya < 0)
                ya = 1;
        if (y + ya > game.getHeight() - 60)
                ya = -1;

        x = x + xa;
        y = y + ya;
    }

    public void paint(Graphics2D g) {
        g.fillRect(x, y, 30, 60);
    }

    public void keyReleased(KeyEvent e) {
            xa = 0;
    }

    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    xa = -1;
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                    xa = 1;
    }

    public Rectangle getBounds() {
        System.out.println("posición Rect2 ("+x+"x, "+y+"y).");
        /* 
            'Rectangle(int,int,int,int)', 
            permite determinar el area de la figura por medio de un rectangulo
            y su posición.
        */
        return new Rectangle(x, y, WITH, HEIGHT);
    }
    /*
    Método para que en el contacto no se cruzen:
    En caso de que las figuras sean de diferentes (medidas o formas),
    los metodos permitirán evitar que los elementos se crucen y generen contacto
    */
    public int getTopY() {
        return y - HEIGHT;
    }
    public int getTopX() {
        return x - WITH;
    }

        

}
