import java.awt.*;
import javax.swing.*;

public class SimpleAnimation {
    JFrame frame;
    private int xii = 20;
    public int yii = 50;

    public static void main(String[] args) throws InterruptedException {
        SimpleAnimation san = new SimpleAnimation();
        san.go();
    }

    public void go() throws InterruptedException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        for (int i = 0; i < 130; i++) {
            xii++;
            yii++;
            drawPanel.repaint();
            Thread.sleep(50);
        }
    }

    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(), this.getHeight());
            g.setColor(Color.blue);
            g.fillOval(xii, yii, 100, 100);
        }
    }
}
