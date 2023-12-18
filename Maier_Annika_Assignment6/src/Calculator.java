
import java.awt.*;
        import javax.swing.*;

public class Calculator {

    // New Window
    JFrame frame = new JFrame("Calculator");

    // Panels
    JPanel result = new JPanel();
    JPanel numberPad = new JPanel(new GridLayout(4, 3));

    // result calculation
    JPanel equal = new JPanel();

    // Calculation Stuff
    JPanel calculationStuff = new JPanel(new GridLayout(2, 4)); // 2x4 grid layout

    // Other
    JPanel other = new JPanel();

    // Labels
    JLabel calculation = new JLabel("0");

    // Labels for buttons
    JLabel divideLabel = new JLabel("/");
    JLabel multiplyLabel = new JLabel("*");
    JLabel minusLabel = new JLabel("-");
    JLabel plusLabel = new JLabel("+");
    JLabel sqrRootLabel = new JLabel("√");
    JLabel equalLabel = new JLabel("=");
    JLabel deleteLabel = new JLabel("<-");
    JLabel deleteAllLabel = new JLabel("C");
    JLabel dotLabel = new JLabel(".");
    JLabel negativeLabel = new JLabel("+/-");

    // Constructor
    public Calculator() {

        // Add calculation label to the result panel, centered
        result.add(calculation, BorderLayout.CENTER);

        // Add number buttons (1-9) to the numberPad panel
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
            numberPad.add(button);
        }

        // Add the '0' button to the numberPad panel
        JButton zeroButton = new JButton("0");
        numberPad.add(zeroButton);

        // Set the layout for the frame
        frame.setLayout(new BorderLayout());

        // Add the result panel to the top of the frame
        frame.add(result, BorderLayout.NORTH);

        // Add the numberPad panel to the center of the frame
        frame.add(numberPad, BorderLayout.CENTER);

        // Add components (labels) to the calculationStuff panel (2x4 grid)
        calculationStuff.add(divideLabel);
        calculationStuff.add(multiplyLabel);
        calculationStuff.add(minusLabel);
        calculationStuff.add(plusLabel);
        calculationStuff.add(sqrRootLabel);
        calculationStuff.add(deleteLabel);
        calculationStuff.add(deleteAllLabel);
        calculationStuff.add(equalLabel);
        calculationStuff.add(dotLabel);
        calculationStuff.add(negativeLabel);

        // Add calculationStuff panel to EAST
        frame.add(calculationStuff, BorderLayout.EAST);

        // Add other panel to WEST
        other.add(new JLabel("Other Panel")); // Placeholder label
        frame.add(other, BorderLayout.WEST);

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    // run it
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
