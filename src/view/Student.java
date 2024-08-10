package view;

import javax.swing.*;
import java.awt.*;

public class Student extends JFrame {
    private JPanel panel1;

    public void LoignView(){
        setTitle("Student");
        setLayout(new GridLayout(3,2));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
