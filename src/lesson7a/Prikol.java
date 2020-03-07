package lesson7a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Prikol extends JFrame {
    JLabel label;
    JButton buttonOk;
    JButton buttonNo;
    Random random;

    public Prikol() {
        setBounds(600, 500, 550, 500);
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        random = new Random();
        Font font = new Font("Arial", Font.PLAIN, 24);

        label = new JLabel("<html>������ <b>��������� <i>��������</i></b> � 2 ����?</html>");
        label.setBounds(40, 20, 500, 200);
        label.setFont(font);
        add(label);


        buttonOk = new JButton("�������! ��!");
        buttonNo = new JButton("���, ��� ������");
        buttonOk.setBounds(50, 300, 200, 50);
        buttonNo.setBounds(300, 300, 200, 50);
        add(buttonOk);
        add(buttonNo);
        buttonOk.setFont(font);
        buttonOk.setFocusable(false);

        buttonOk.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                buttonOk.setLocation(random.nextInt(450),random.nextInt(450) );
            }
        });

        setVisible(true);
    }
}
