import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Player extends Rectangle {

    static int x; 
    static int y;
    static int w;
    static int h;

    Player(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    System.out.println("up");
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("down");
                    break;
                case KeyEvent.VK_LEFT:
                    System.out.println("left");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("right");
                    break;
            }

        }
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    System.out.println("up released");
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("down released");
                    break;
                case KeyEvent.VK_LEFT:
                    System.out.println("left released");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("right released");
                    break;
            }

        }

}
