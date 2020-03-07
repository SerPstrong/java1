package lesson7a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(600, 500, 500, 500);
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("Button #1");
        add(btn1, BorderLayout.NORTH);
        btn1.setPreferredSize(new Dimension(20, 100));

        JButton btn2 = new JButton("Button #2");
        add(btn2, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);


//        btn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello");
//            }
//        });

        btn1.addActionListener(e -> {
            System.out.println("Hello");
        });

        btn2.addActionListener(e -> {
            textArea.append("Hello\n");
        });

        setVisible(true);
    }
}
