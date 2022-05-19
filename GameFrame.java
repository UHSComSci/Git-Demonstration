import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class GameFrame implements KeyListener {
    public static JFrame frame;

    public GameFrame() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.addKeyListener(this);
        frame.pack();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch( keyCode ) { 
            case KeyEvent.VK_UP:
                System.out.println("up");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("down");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("left");
                break;
            case KeyEvent.VK_RIGHT :
                System.out.println("right");
                break;
        }
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch( keyCode ) { 
            case KeyEvent.VK_UP:
                System.out.println("up released");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("down released");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("left released");
                break;
            case KeyEvent.VK_RIGHT :
                System.out.println("right released");
                break;
        }
        
    }
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}