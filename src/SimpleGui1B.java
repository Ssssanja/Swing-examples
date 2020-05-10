import javax.swing.*;
import java.awt.event.*;
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    public void go(){
        MyDrawPanel f = new MyDrawPanel();
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
