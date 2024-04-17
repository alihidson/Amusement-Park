import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePage extends JFrame {
    public Image backgroundImage;
    private ScoreboardPanel scoreboardPanel;

    private Image scoreboardBackgroundImage;


    public GamePage() {

        setTitle("Game Play");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 750);
        setResizable(false);
        setLocationRelativeTo(null);


        backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/wood.jpg").getImage();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(700, 500));

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1280, 740);
        layeredPane.add(backgroundPanel, Integer.valueOf(1));


        scoreboardPanel = new ScoreboardPanel();
        scoreboardPanel.setBounds(1000, 0, 280, 720);
        layeredPane.add(scoreboardPanel, Integer.valueOf(2)); // Add scoreboard panel to be on top


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
                int x = (getWidth() - metrics.stringWidth(User.Name1)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name1, x, y);
            }
        };
        rectangle1.setBounds(50, 25, 100, 50);
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
                int x = (getWidth() - metrics.stringWidth(User.Name2)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name2, x, y);
            }
        };
        rectangle2.setBounds(50, 625, 100, 50);
        layeredPane.add(rectangle2, Integer.valueOf(3));





        JPanel rectangle3 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth("Store")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString("Store", x, y);
            }
        };
        rectangle3.setBounds(600, 300, 100, 50);
        rectangle3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                Store store = new Store();
                store.setVisible(true);
            }
        });
        layeredPane.add(rectangle3, Integer.valueOf(3));

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




    private class ScoreboardPanel extends JPanel {

        public ScoreboardPanel() {
            scoreboardBackgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/woodScore.jpg").getImage();
            setOpaque(false);
            setPreferredSize(new Dimension(350, 200));
            // Add a border around the panel
            setBorder(BorderFactory.createLineBorder(new Color(158, 72, 177), 4)); // Adjust color and thickness as needed
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw background image
            g.drawImage(scoreboardBackgroundImage, 0, 0, getWidth(), getHeight(), this);
            // Draw text
            g.setColor(Color.BLACK);
            Font font = new Font("Arial", Font.PLAIN, 12);
            g.setFont(font);
            g.drawString("Player 1 Score: " + calculatePlayerScore(1), 20, 20);
            g.drawString("Player 2 Score: " + calculatePlayerScore(2), 20, 40);
        }

        private int calculatePlayerScore(int playerNumber) {
            int score = 0;
            if (playerNumber == 1) {
                score += User.numberRedCoin1 + User.numberGreenCoin1 + User.numberBlueCoin1 +
                        User.numberWhiteCoin1 + User.numberBlackCoin1 + User.numberGoldCoin1;
            }
            else if (playerNumber == 2) {
                score += User.numberRedCoin2 + User.numberGreenCoin2 + User.numberBlueCoin2 +
                        User.numberWhiteCoin2 + User.numberBlackCoin2 + User.numberGoldCoin2;
            }
            return score;
        }
    }

}