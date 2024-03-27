import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Amusement Park");
        frame.setSize(1250, 700);


        ImageIcon backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement Park/src/swing_image/wood.jpg");
        Image img = backgroundImage.getImage(); // create image object

        // set size of image based on frame
        Image scaledImg = img.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);


        ImageIcon scaledBackgroundImage = new ImageIcon(scaledImg);

        JLabel background = new JLabel("", scaledBackgroundImage, JLabel.CENTER); // create label of background
        Border border = BorderFactory.createLineBorder(new Color(220, 94, 192), 8); // set border around of window
        background.setBorder(border); // set border of label
        background.setBounds(0, 0, frame.getWidth(), frame.getHeight()); // set position of label
        frame.add(background);  // add label to main panel
        frame.getContentPane().setLayout(null); // set layout of main panel for delete extra frame
        frame.setVisible(true);
    }
}
