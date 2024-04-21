import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePage extends JFrame {
    public Image backgroundImage;


    public GamePage() {


        if(User.sw1 == 1) {
            User.sw1 = 0;
            User.sw2 = 1;
            User.turn = User.Name2;
        }
        else {
            User.sw2 = 0;
            User.sw1 = 1;
            User.turn = User.Name1;
        }

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
                g.setColor(Color.orange);
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
        rectangle1.setBounds(25, 25, 100, 50);
        layeredPane.add(rectangle1, Integer.valueOf(3));


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
                int x = (getWidth() - metrics.stringWidth(User.Name2)) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name2, x, y);
            }
        };
        rectangle2.setBounds(25, 85, 100, 50);
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



        if(User.prizeClaw1_1) {
            PrizeClawPanel prizeClaw1 = new PrizeClawPanel(1);
            prizeClaw1.setBounds(400, 50, 100, 150);
            prizeClaw1.setOpaque(false);
            layeredPane.add(prizeClaw1, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name1,400 + 22, 50 + 140), Integer.valueOf(5));
            }
        else if(User.prizeClaw1_2) {
            PrizeClawPanel prizeClaw1 = new PrizeClawPanel(1);
            prizeClaw1.setBounds(400, 50, 100, 150);
            prizeClaw1.setOpaque(false);
            layeredPane.add(prizeClaw1, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name2,400 + 22, 50 + 140), Integer.valueOf(5));
        }


        if(User.prizeClaw2_1) {
            PrizeClawPanel prizeClaw2 = new PrizeClawPanel(2);
            prizeClaw2.setBounds(485, 50, 100, 150);
            prizeClaw2.setOpaque(false);
            layeredPane.add(prizeClaw2, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name1,485 + 22, 50 + 140), Integer.valueOf(5));
        }
        else if(User.prizeClaw2_2) {
            PrizeClawPanel prizeClaw2 = new PrizeClawPanel(2);
            prizeClaw2.setBounds(485, 50, 100, 150);
            prizeClaw2.setOpaque(false);
            layeredPane.add(prizeClaw2, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name2,485 + 22, 50 + 140), Integer.valueOf(5));
        }


        if(User.prizeClaw3_1) {
            PrizeClawPanel prizeClaw3 = new PrizeClawPanel(3);
            prizeClaw3.setBounds(570, 50, 100, 150);
            prizeClaw3.setOpaque(false);
            layeredPane.add(prizeClaw3, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name1,570 + 22, 50 + 140), Integer.valueOf(5));
        }
        else if(User.prizeClaw3_2) {
            PrizeClawPanel prizeClaw3 = new PrizeClawPanel(3);
            prizeClaw3.setBounds(570, 50, 100, 150);
            prizeClaw3.setOpaque(false);
            layeredPane.add(prizeClaw3, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name2,570 + 22, 50 + 140), Integer.valueOf(5));
        }







//        if(User.cardPanel11_1 > 0) {
//            CardPanelOne cardPanel11 = new CardPanelOne(1);
//            cardPanel11.setBounds(50, 50, 100, 150);
//            cardPanel11.setOpaque(false);
//            layeredPane.add(cardPanel11, Integer.valueOf(4));
//            layeredPane.add(createRectangle1(User.cardPanel11_1,50 + 40, 50 + 150), Integer.valueOf(5));
//        }





















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

    private JPanel createRectangle1(int n, int x, int y) {
        JPanel rectangle = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.orange);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                String number = String.valueOf(n);
                int xText = (getWidth() - metrics.stringWidth(number)) / 2;
                int yText = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(number, xText, yText);
            }
        };
        rectangle.setBounds(x, y, 20, 20);
        return rectangle;
    }



    private JPanel createRectangle2(int n, int x, int y) {
        JPanel rectangle = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.orange);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                String number = String.valueOf(n);
                int xText = (getWidth() - metrics.stringWidth(number)) / 2;
                int yText = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(number, xText, yText);
            }
        };
        rectangle.setBounds(x, y, 20, 20);
        return rectangle;
    }


    private JPanel createRectangleName(String NameCharacter, int x, int y) {
        JPanel rectangle = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255,0,145));
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.WHITE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int xText = (getWidth() - metrics.stringWidth(NameCharacter)) / 2;
                int yText = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(NameCharacter, xText, yText);
            }
        };
        rectangle.setBounds(x, y, 50, 30);
        return rectangle;
    }

}