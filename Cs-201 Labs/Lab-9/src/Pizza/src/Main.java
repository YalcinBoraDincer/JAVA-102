import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Main implements Runnable {

    private static final Insets bottomInsets = new Insets(10, 10, 10, 10);
    private static final Insets normalInsets = new Insets(10, 10, 0, 10);
    private static ButtonGroup group = new ButtonGroup();
    private static ButtonGroup group1 = new ButtonGroup();


    private JCheckBox cbTomato, cbGreenPepper, cbBlackOlives, cbMushrooms, cbExtraCheese, cbPepperoni, cbSausage;

    private JRadioButton rbSmall, rbMedium, rbLarge, rbThinCrust,
            rbMediumCrust, rbPan;

    private JTextArea textArea;
    private JPanel topping = createToppingPanel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("Pizza Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        int gridy = 0;

        addComponent(mainPanel, createTitlePanel(), 0, gridy++, 2, 1,
                normalInsets, GridBagConstraints.LINE_START,
                GridBagConstraints.HORIZONTAL);



        addComponent(mainPanel, topping, 0, gridy, 1, 1,
                normalInsets, GridBagConstraints.LINE_START,
                GridBagConstraints.HORIZONTAL);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BorderLayout());
        eastPanel.add(createSizePanel(), BorderLayout.WEST);
        eastPanel.add(new JLabel("   "), BorderLayout.CENTER);
        eastPanel.add(createTypePanel(), BorderLayout.EAST);
        eastPanel.add(createButtonPanel(), BorderLayout.SOUTH);

        addComponent(mainPanel, eastPanel, 1, gridy++, 1, 1, normalInsets,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL);

        addComponent(mainPanel, createTextAreaPanel(), 0, gridy++, 2, 1,
                bottomInsets, GridBagConstraints.LINE_START,
                GridBagConstraints.HORIZONTAL);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }

    private JPanel createTitlePanel() {
        JPanel panel = new JPanel();

        JLabel lblWelcome = new JLabel("Welcome to Home Style Pizza Shop");
        Font titleFont = lblWelcome.getFont().deriveFont(20F);
        lblWelcome.setFont(titleFont);
        lblWelcome.setForeground(Color.RED);

        panel.add(lblWelcome);

        return panel;
    }

    private JPanel createToppingPanel() {
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 2);
        Border emptyBorder = BorderFactory.createEmptyBorder(4, 10, 4, 10);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createCompoundBorder(redBorder,
                emptyBorder));
        panel.setLayout(new GridLayout(0, 1));

        JLabel lblEachTopping = new JLabel("Each Topping: $1.50");
        lblEachTopping.setForeground(Color.RED);
        panel.add(lblEachTopping);

        cbTomato = new JCheckBox("Tomato");
        cbGreenPepper = new JCheckBox("Green Pepper");
        cbBlackOlives = new JCheckBox("Black Olives");
        cbMushrooms = new JCheckBox("Mushrooms");
        cbExtraCheese = new JCheckBox("Extra Cheese");
        cbPepperoni = new JCheckBox("Pepperoni");
        cbSausage = new JCheckBox("Sausage");

        cbTomato.setActionCommand("tomato");
        cbGreenPepper.setActionCommand("green pepper");
        cbBlackOlives.setActionCommand("black olives");
        cbMushrooms.setActionCommand("mushrooms");
        cbExtraCheese.setActionCommand("extra cheese");
        cbPepperoni.setActionCommand("pepperoni");
        cbSausage.setActionCommand("sausage");

        panel.add(cbTomato);
        panel.add(cbGreenPepper);
        panel.add(cbBlackOlives);
        panel.add(cbMushrooms);
        panel.add(cbExtraCheese);
        panel.add(cbPepperoni);
        panel.add(cbSausage);

        return panel;
    }

    private JPanel createSizePanel() {
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 2);
        Border emptyBorder = BorderFactory.createEmptyBorder(4, 10, 4, 20);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createCompoundBorder(redBorder, emptyBorder));
        panel.setLayout(new GridLayout(0, 1));

        JLabel lblPizzaSize = new JLabel("Pizza Size");
        lblPizzaSize.setForeground(Color.RED);
        panel.add(lblPizzaSize);

        rbSmall = new JRadioButton("Small: $6.50");
        rbMedium = new JRadioButton("Medium: $8.50");
        rbLarge = new JRadioButton("Large: $10.00");
        rbSmall.setActionCommand("small");
        rbMedium.setActionCommand("medium");
        rbLarge .setActionCommand("large");
        group.add(rbSmall);
        group.add(rbMedium);
        group.add(rbLarge);

        panel.add(rbSmall);
        panel.add(new JLabel(""));
        panel.add(rbMedium);
        panel.add(new JLabel(""));
        panel.add(rbLarge);

        return panel;
    }

    private JPanel createTypePanel() {
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 2);
        Border emptyBorder = BorderFactory.createEmptyBorder(4, 10, 4, 10);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createCompoundBorder(redBorder, emptyBorder));
        panel.setLayout(new GridLayout(0, 1));

        JLabel lblPizzaType = new JLabel("Pizza Type");
        lblPizzaType.setForeground(Color.RED);
        panel.add(lblPizzaType);

        rbThinCrust = new JRadioButton("Thin Crust");
        rbMediumCrust = new JRadioButton("Medium Crust");
        rbPan = new JRadioButton("Pan");

        rbThinCrust.setActionCommand("thin crust");
        rbMediumCrust.setActionCommand("medium crust");
        rbPan.setActionCommand("pan crust");

        group1.add(rbThinCrust);
        group1.add(rbMediumCrust);
        group1.add(rbPan);

        panel.add(rbThinCrust);
        panel.add(new JLabel(""));
        panel.add(rbMediumCrust);
        panel.add(new JLabel(""));
        panel.add(rbPan);

        return panel;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();

        JButton btnProcessSelection = new JButton("Process Selection");
        btnProcessSelection.addActionListener(new buttonListener());
        panel.add(btnProcessSelection);

        return panel;
    }

    private JPanel createTextAreaPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel lblYourOrder = new JLabel("Your order:");
        panel.add(lblYourOrder, BorderLayout.NORTH);

        textArea = new JTextArea(6, 12);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    private void addComponent(Container container, Component component,
                              int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
                              int anchor, int fill) {
        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy,
                gridwidth, gridheight, 1.0D, 1.0D, anchor, fill, insets, 0, 0);
        container.add(component, gbc);
    }

    private class buttonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            double amount = 0;

            textArea.append("Pizza Type: " + group1.getSelection().getActionCommand());
            textArea.append("\nPizza Size: " + group.getSelection().getActionCommand());
            rbSmall.setActionCommand("small");
            rbMedium.setActionCommand("medium");
            rbLarge .setActionCommand("large");
            group.add(rbSmall);
            if (group.getSelection().getActionCommand().equals("small")){
                amount += 6.5;
            }else if(group.getSelection().getActionCommand().equals("medium")){
                amount += 8.5;
            }else{
                amount += 10;
            }

            textArea.append("\nToppings: ");
            for (Component child: topping.getComponents()) {
                if (child instanceof JCheckBox checkBox) {
                    if (checkBox.isSelected()) {
                        textArea.append(checkBox.getActionCommand() + ", ");
                        amount += 1.5;
                    }
                }
            }
            textArea.append("\nAmount Due: $" + amount);
        }

    }

}