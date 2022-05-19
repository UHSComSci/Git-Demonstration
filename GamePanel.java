
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {
    Thread gameThread;
    Player player;
    Image image;
    Graphics graphics;

    public GamePanel() {
        initPlayer();
        this.setFocusable(true);
        this.addKeyListener(new KL());
        this.setPreferredSize(new Dimension(600, 600));
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void initPlayer() {
        player = new Player(4102, 12414, 50, 50);
    }

    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);
    }

    public void draw(Graphics g) {
        player.draw(g);
    }

    public void run() {
        // game loop
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        boolean running = true;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                repaint();
                delta--;
            }

        }
    }

    public class KL extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);

        }
    }

}
