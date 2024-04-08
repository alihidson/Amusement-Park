import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FirstPage extends JPanel {

    public FirstPage() {

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
        rectangle1.setBounds(600, 100, 100, 50);





//        JPanel rectangle2 = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.setColor(Color.green);
//                g.fillRect(0, 0, getWidth(), getHeight());
//                g.setColor(Color.BLUE);
//                Font font = new Font("Arial", Font.PLAIN, 12);
//                g.setFont(font);
//                FontMetrics metrics = g.getFontMetrics(font);
//                int x = (getWidth() - metrics.stringWidth("ID")) / 2;
//                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
//                g.drawString("ID", x, y);
//            }
//        };
//        rectangle2.setBounds(600, 100, 100, 50);





        rectangle1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(FirstPage.this);
                //frame.dispose();

                JFrame namePageFrame = new NamePage();
                namePageFrame.setVisible(true);
            }
        });




        add(rectangle1);
//      add(rectangle2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/Amusement-Park.jpg").getImage();
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}

