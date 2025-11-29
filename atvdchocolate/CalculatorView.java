import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    JTextField fieldA = new JTextField(5);
    JButton addButton = new JButton("Add");
    JLabel resultLabel = new JLabel("Result: ");

    public CalculatorView() {
        super("MVC Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("A:"));
        add(fieldA);
        add(addButton);
        add(resultLabel);

        pack();
        setMinimumSize(new java.awt.Dimension(400, 80));
        setVisible(true);
    }

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public String getValueA() {
        return fieldA.getText();
    }

    public void setResult(String text) {
        resultLabel.setText(text);
    }
}
