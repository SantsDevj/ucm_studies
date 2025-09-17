package swing_charapters.part_8;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayered_Pane {
    public static void main(String[] args) {
        //Criando uma label
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setBounds(50,50,200,200);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(100,100,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(150,150,200,200);


        //Criando uma JLayeredPane

        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0,0,500,500);

        layer.add(label, Integer.valueOf(0));
        layer.add(label1, Integer.valueOf(2));
        layer.add(label2, Integer.valueOf(1));

        //Criando a janela
        JFrame frame = new JFrame();
        frame.add(layer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
