import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1280, 740);
        frame.setTitle("Amusement-Park");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FirstPage firstPage = new FirstPage();
        frame.add(firstPage);
        frame.setVisible(true);
    }
}