import javax.swing.*;
import java.awt.*;

public class GamePage extends JFrame {
    public Image backgroundImage;
    public static String userName1;
    public static String userName2;


    public GamePage(String userName1, String userName2) {
        this.userName1 = userName1;
        this.userName2 = userName2;

        setTitle("Game Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 740);
        setLocationRelativeTo(null);


        backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/wood.jpg").getImage();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(700, 500));

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1280, 740);

        CardPanelOne cardPanel = new CardPanelOne();

        cardPanel.setBounds(50, 50, 900, 400);
        cardPanel.setOpaque(false);

        layeredPane.add(backgroundPanel, Integer.valueOf(1));
        layeredPane.add(cardPanel, Integer.valueOf(2));



        JPanel rectangle1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.pink);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(userName1)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(userName1, x, y);
            }
        };
        rectangle1.setBounds(1000, 100, 100, 50);
        layeredPane.add(rectangle1, Integer.valueOf(3));


        JPanel rectangle2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(userName2)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(userName2, x, y);
            }
        };
        rectangle2.setBounds(1000, 200, 100, 50);
        layeredPane.add(rectangle2, Integer.valueOf(3));


        setContentPane(layeredPane);
    }





    public GamePage() {

        setTitle("Game Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 740);
        setLocationRelativeTo(null);


        backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/wood.jpg").getImage();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(700, 500));

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1280, 740);

        CardPanelOne cardPanel = new CardPanelOne();

        cardPanel.setBounds(50, 50, 900, 400);
        cardPanel.setOpaque(false);

        layeredPane.add(backgroundPanel, Integer.valueOf(1));
        layeredPane.add(cardPanel, Integer.valueOf(2));



        JPanel rectangle1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.pink);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(userName1)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(userName1, x, y);
            }
        };
        rectangle1.setBounds(1000, 100, 100, 50);
        layeredPane.add(rectangle1, Integer.valueOf(3));


        JPanel rectangle2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(userName2)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(userName2, x, y);
            }
        };
        rectangle2.setBounds(1000, 200, 100, 50);
        layeredPane.add(rectangle2, Integer.valueOf(3));


        setContentPane(layeredPane);
    }


    private class BackgroundPanel extends JPanel {
        public BackgroundPanel() {
            setOpaque(false);
            setLayout(new BorderLayout());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}