import javax.swing.*;

class SimpleGUI {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("My First GUI");

        // Create Label
        JLabel label = new JLabel("Hello Hardik!");

        // Create Button
        JButton button = new JButton("Click Me");

        // Set positions
        label.setBounds(130, 50, 100, 30);
        button.setBounds(120, 100, 100, 30);

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Frame settings
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}