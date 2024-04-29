import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class EndPage extends JPanel {

    public EndPage() {
        setLayout(null);

        JPanel rectangle1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth("Start")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString("Start", x, y);
            }
        };
        rectangle1.setBounds(600, 150, 100, 50);



        JPanel rectangle2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.green);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth("Exit")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString("Exit", x, y);
            }
        };
        rectangle2.setBounds(600, 205, 100, 50);


        rectangle2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        add(rectangle1);
        add(rectangle2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/Amusement-Park.jpg").getImage();
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Adding text to the page
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File("/Users/ali/Main/Documents/Source/Amusement-Park/src/Font/PinyonScript-Regular.ttf")).deriveFont(Font.BOLD, 44);
            g.setFont(font);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        g.setColor(Color.red);
        String text = "Amusement Park is Finish" + "\n" + "The first player is: " + User.winPlayer;
        int x = 460; // X coordinate
        int y = 100; // Y coordinate
        g.drawString(text, x, y);
    }
}
