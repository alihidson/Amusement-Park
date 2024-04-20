import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePage extends JFrame {
    public Image backgroundImage;



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


        ScoreBoardPanel scoreBoard = new ScoreBoardPanel();
        scoreBoard.setBounds(1000, 0, 280, 362);
        layeredPane.add(scoreBoard, Integer.valueOf(2)); // Add scoreboard panel to be on top


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
                g.setColor(Color.green);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(User.Name1 + " Store")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name1 + " Store", x, y);
            }
        };
        rectangle3.setBounds(1090, 380, 100, 50);

        if(User.sw1 == 1) {
            rectangle3.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    dispose();
                    Store store = new Store();
                    store.setVisible(true);
                }
            });

            Coin.countGetCoin = 3;
            User.numberUserGetRedCoin = 0;
            User.numberUserGetGreenCoin = 0;
            User.numberUserGetBlueCoin = 0;
            User.numberUserGetWhiteCoin = 0;
            User.numberUserGetBlackCoin = 0;








        }
        layeredPane.add(rectangle3, Integer.valueOf(3));



        JPanel rectangle4 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.orange);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(User.Name2 + " Store")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name2 + " Store", x, y);
            }
        };
        rectangle4.setBounds(1090, 450, 100, 50);

        if(User.sw2 == 1) {
            rectangle4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    dispose();
                    Store store = new Store();
                    store.setVisible(true);
                }
            });

            Coin.countGetCoin = 3;
            User.numberUserGetRedCoin = 0;
            User.numberUserGetGreenCoin = 0;
            User.numberUserGetBlueCoin = 0;
            User.numberUserGetWhiteCoin = 0;
            User.numberUserGetBlackCoin = 0;










        }
        layeredPane.add(rectangle4, Integer.valueOf(3));

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