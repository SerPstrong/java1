package lesson7a;

import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    public MyWindow2() {
        setBounds(600, 500, 500, 500);
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//        setLayout(new BorderLayout());
//        setLayout(new FlowLayout());
//        setLayout(new GridLayout(6,3));

//        for (int i = 0; i < 10 ; i++) {
//            JButton btn1 = new JButton("Button #"+i);
//            add(btn1);
//        }

        JPanel southPanel = new JPanel(new GridLayout(2, 2));
        for (int i = 0; i < 4; i++) {
            JButton btn1 = new JButton("Button #" + i);
            southPanel.add(btn1);
            final int x = i;
            btn1.addActionListener(e -> {
                System.out.println(x);
            });
        }


        add(southPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
