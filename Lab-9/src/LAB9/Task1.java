package LAB9;
import javax.swing.*;
import java.awt.*;

public class Task1 {


    public static void task1(){
        JFrame jFrame = new JFrame();

        jFrame.setTitle("Flow Layout Demo");

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,80);
        jFrame.setResizable(true);
        JPanel jPanel = new JPanel(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Long Named Button 4");
        JButton button5 = new JButton("5");

        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);
        jPanel.add(button5);

        jFrame.add(jPanel);
        jFrame.setVisible(true);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }




}