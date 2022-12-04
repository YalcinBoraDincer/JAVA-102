// import required classes
package LAB9;

import java.awt.*;

import javax.swing.*;


public class Task2 {

    public static void task2(){



            JFrame frame = new JFrame("BorderLayoutDemo");


            frame.add(new JButton("Button 1 (PAGE_START)"), BorderLayout.NORTH);


            frame.add(new JButton("Long-Named Button 4 (PAGE_END)"), BorderLayout.SOUTH);


            frame.add(new JButton("5 (LINE_END)"), BorderLayout.EAST);


            frame.add(new JButton("Button 3 (LINE_START)"), BorderLayout.WEST);


            frame.add(new JButton("Button 2 (CENTER)"), BorderLayout.CENTER);


            frame.setSize(500, 180);


            frame.setVisible(true);

        }
    }






