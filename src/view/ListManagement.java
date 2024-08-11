package view;
import javax.swing.*;
import java.awt.*;

public class ListManagement {
    

    
    public ListManagement(){
        
        JFrame jFrame = new JFrame("List option for Student Management");

        Box box = Box.createHorizontalBox();

        JButton button1 = new JButton("Course");
        JButton button2 = new JButton("Student");
        JButton button3 = new JButton("Teacher");
        JButton button4 = new JButton("Room");

        box.add(button1);
        box.add(button2);
        box.add(button3);
        box.add(button4);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jFrame.getContentPane().add(box);

        
    }


    
}
