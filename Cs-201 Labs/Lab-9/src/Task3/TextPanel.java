package Task3;
import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private JTextArea textArea;
    public TextPanel() {
        textArea = new JTextArea();

        setLayout(new BorderLayout());

    }
    public void appendText(String text){
        textArea.append(text);
    }
}