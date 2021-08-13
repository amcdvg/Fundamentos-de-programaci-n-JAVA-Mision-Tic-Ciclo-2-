package com.example;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class image extends JFrame{
    public image(String fich) {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon ii = new ImageIcon(fich);
        c.add(new JLabel("", ii, JLabel.CENTER));
        setSize(650 ,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new image("homero.jpg");
    }
}
