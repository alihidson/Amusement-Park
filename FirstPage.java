import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FirstPage extends JPanel {

    public FirstPage() {

        setLayout(null);



        JPanel rectangle = new JPanel() {
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
        rectangle.setBounds(600, 100, 100, 50);


        rectangle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(FirstPage.this);
                frame.dispose();

                JFrame namePageFrame = new NamePage();
                namePageFrame.setVisible(true);
            }
        });
        add(rectangle);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/wood.jpg").getImage();
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}

