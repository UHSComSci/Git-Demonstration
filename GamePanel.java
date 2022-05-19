import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable {

    Player player;

    public GamePanel() {
        initPlayer();
        this.setFocusable(true);
        this.addKeyListener(new KL());
        this.setPreferredSize(new Dimension(600, 600));
    }

    public void initPlayer() {
        player = new Player(50, 50, 50, 50);
    }

    public void run() {

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
