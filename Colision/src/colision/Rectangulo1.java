/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colision;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Estudiantes
 */
public class Rectangulo1 {
        private static final int WITH = 30;
        private static final int HEIGHT = 60;
        int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private Colision game;

	public Rectangulo1(Colision game) {
		this.game= game;
	}

	void move() {
		if (x + xa < 0)
                    xa = 1;
		if (x + xa > game.getWidth() - WITH)
                    xa = -1;
		if (y + ya < 0)
                    ya = 1;
		if (y + ya > game.getHeight() - HEIGHT)
                    ya = -1;
                if (collision()){
                    
                    game.gameOver();
                }
		x = x + xa;
		y = y + ya;
	}
                
	public void paint(Graphics2D g) {
		g.fillRect(x, y, WITH, HEIGHT);
	}
        private boolean collision() {
		return game.rect_2.getBounds().intersects(getBounds());
	}
        
        public Rectangle getBounds() {            
            System.out.println("posición Rect1 ("+x+"x, "+y+"y).");
            return new Rectangle(x, y, WITH, HEIGHT);
        }

}
