package JFD.Sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame implements ActionListener, KeyListener {

    private static final long serialVersion = 1L;
    JTextField textField = new JTextField(15);
    JButton button = new JButton("Copy");
    JLabel label = new JLabel("Initial label");

    public SimpleGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        button.addActionListener(this);
        textField.addKeyListener(this);
        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked");
    }

    static void main() {
        SimpleGUI gui = new SimpleGUI();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText(textField.getText());
    }
}
