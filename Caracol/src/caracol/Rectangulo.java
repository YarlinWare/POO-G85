/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Estudiantes
 */
public class Rectangulo {
        private static final int WITH = 30;
        private static final int HEIGHT = 30;
        int x = -10;
	int y = 0;
	int xa = 1;
	int ya = 0;
	private Caracol game;
        int conteo=0;
	public Rectangulo(Caracol game) {
		this.game= game;
	}

	void move() {
            if ((x + xa < 0) &&(conteo==0))
                xa = 1;
            if (x + xa > game.getWidth() - WITH){
                xa = 0;
                ya = 1;
                conteo=1;
            }                
            if (y + ya < 0)
                ya = 1;
            if (y + ya > game.getHeight() - HEIGHT){
                ya = 0;
                xa = -1;
            }
            if ((y==(game.getHeight()-HEIGHT))&&(x==5)){
                xa = 0;
                ya = -1;
                conteo=0;
                
            }
            if (collision()){
               
            }
            x = x + xa;
            y = y + ya;
	}
                
	public void paint(Graphics2D g) {            
            g.setColor(Color.ORANGE);
            g.fillRect(x, y, WITH, HEIGHT);
	}
        private boolean collision() { 
            return game.rect_1.getBounds().intersects(getBounds());
	}
        
        public Rectangle getBounds() {            
            System.out.println("posición Rect1 ("+x+"x, "+y+"y).");
            return new Rectangle(x, y, WITH, HEIGHT);
        }

    
}
