package Task3;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JLabel firstint;
    private JLabel secondint;
    private JLabel result;
    private JTextField firstField;
    private JTextField secondField;
    private JTextField resultField;
    private JButton add;
    private JButton clear;

    public FormPanel() {

        firstint = new JLabel("First Number: ");
        secondint = new JLabel("Second Number: ");
        result = new JLabel("Result: ");
        firstField = new JTextField(30);
        secondField = new JTextField(30);
        resultField = new JTextField(30);


        add = new JButton("Add");
        clear = new JButton("Clear");


        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double i = Double.parseDouble(firstField.getText());
                double j = Double.parseDouble(secondField.getText());
                resultField.setText(String.valueOf(i+j));
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstField.setText(null);
                secondField.setText(null);
                resultField.setText(null);
            }
        });


        Border innerBorder = BorderFactory.createTitledBorder("Number Addition");
        Border outerBorder = BorderFactory.createEmptyBorder(30,30,30,30);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));


        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        //////////////////FIRST ROW//////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(25,10,0,5);
        add(firstint, gc);

        gc.gridx = 1;
        gc.gridy =0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(25,0,0,5);
        add(firstField, gc);

        //////////////////SECOND ROW//////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(25,10,0,5);
        add(secondint, gc);

        gc.gridx = 1;
        gc.gridy =1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(25,0,0,5);
        add(secondField, gc);

        //////////////////THIRD ROW//////////////////
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(25,10,0,5);
        add(result, gc);

        gc.gridx = 1;
        gc.gridy =2;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(25,0,0,5);
        add(resultField, gc);


        //////////////////FOURTH ROW//////////////////
        gc.weightx = 0.01;
        gc.weighty = 0.1;

        gc.gridx = 1;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.CENTER;
        gc.insets = new Insets(25,0,10,5);
        add(add, gc);

        gc.gridx = 1;
        gc.gridy =3;
        gc.anchor = GridBagConstraints.CENTER;
        gc.insets = new Insets(25,200,10,0);
        add(clear, gc);


    }

}