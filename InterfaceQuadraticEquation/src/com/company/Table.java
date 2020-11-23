package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends JFrame {

    Table(){







        JFrame frame = new JFrame("Решение квадратного уравнения-AX^2+BX+C=0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("A");
        JLabel label2 = new JLabel("B");
        JLabel label3 = new JLabel("C");
        JTextField tf = new JTextField(5);
        JTextField tf2 = new JTextField(5);
        JTextField tf3 = new JTextField(5);
        JButton send = new JButton("Посчитать");

        panel.add(label);
        panel.add(tf);
        panel.add(label2);
        panel.add(tf2);
        panel.add(label3);
        panel.add(tf3);
        panel.add(send);


        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float a = Float.parseFloat(tf.getText());
                float b = Float.parseFloat(tf2.getText());
                float c = Float.parseFloat(tf3.getText());
                Uravnenie uravnenie=new Uravnenie(a,b,c);
                if(uravnenie.chekFlag()) {
                    JOptionPane.showMessageDialog(Table.this,
                            uravnenie.getX1() + "  " + uravnenie.getX2());
                }else
                {
                    JOptionPane.showMessageDialog(Table.this,
                            "Уравнение не имеет решения,введите другие значения");
                }
            }
        });



        frame.getContentPane().add(BorderLayout.CENTER, panel);


        frame.setVisible(true);

    }

}
