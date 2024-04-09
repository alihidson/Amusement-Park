import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NamePage extends JFrame {
    private static String userName1;
    private static String userName2;

    public NamePage() {
        setTitle("Please enter your name: ");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        getContentPane().setBackground(Color.YELLOW);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


        JLabel nameLabel1 = new JLabel("First player: ");
        add(nameLabel1);

        JTextField nameField1 = new JTextField(20);
        add(nameField1);


        JLabel nameLabel2 = new JLabel("Second player: ");
        add(nameLabel2);

        JTextField nameField2 = new JTextField(20);
        add(nameField2);


        add(Box.createVerticalStrut(10));


        JButton submitButton = new JButton("Accept");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userName1 = nameField1.getText();
                userName2 = nameField2.getText();
                dispose();
                JFrame gamePage = new GamePage(userName1, userName2);
                gamePage.setVisible(true);
            }
        });
    }
}
