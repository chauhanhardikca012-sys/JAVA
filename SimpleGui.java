import javax.swing.*;

class SimpleGui {
    public static void main(String[] args) {

        JFrame f = new JFrame("Simple GUI");

        JLabel l = new JLabel("Hello World");

        l.setBounds(100, 100, 100, 30);

        f.add(l);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}