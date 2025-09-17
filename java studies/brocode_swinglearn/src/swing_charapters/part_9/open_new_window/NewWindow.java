package swing_charapters.part_9.open_new_window;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Olá! Seja bem-vindo!");

    NewWindow(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font("verdana", Font.PLAIN, 25));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
