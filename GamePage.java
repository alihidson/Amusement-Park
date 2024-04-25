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

        if(User.Score1 == 15 ^ User.Score2 == 15) { // ^ means XOR
            if(User.Score1 == 15 && User.Score2 < 15)
                User.winPlayer = User.Name1;
            else if(User.Score2 == 15 && User.Score1 < 15)
                User.winPlayer = User.Name2;
            JFrame frame = new JFrame();
            frame.setSize(1280, 750);
            frame.setTitle("End Page");
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            EndPage finishPage = new EndPage();
            frame.add(finishPage);
            frame.setVisible(true);
        }
        if(User.Score1 == 15 && User.Score2 == 15) {
            if(User.numberOfCard1 < User.numberOfCard2)
                User.winPlayer = User.Name1;
            else if(User.numberOfCard1 > User.numberOfCard2)
                User.winPlayer = User.Name2;
            JFrame frame = new JFrame();
            frame.setSize(1280, 750);
            frame.setTitle("End Page");
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            EndPage finishPage = new EndPage();
            frame.add(finishPage);
            frame.setVisible(true);
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
        scoreBoard.setBounds(900, 0, 380, 437);
        layeredPane.add(scoreBoard, Integer.valueOf(2)); // Add scoreboard panel to be on top


        JPanel rectangle1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.green);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 14);
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
                g.setColor(new Color(255,0,145));
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                Font font = new Font("Arial", Font.PLAIN, 14);
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
                Font font = new Font("Arial", Font.PLAIN, 14);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(User.Name1 + " Store")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name1 + " Store", x, y);
            }
        };
        rectangle3.setBounds(1090, 480, 100, 50);

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
                g.setColor(new Color(255,0,145));
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                Font font = new Font("Arial", Font.PLAIN, 14);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth(User.Name2 + " Store")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString(User.Name2 + " Store", x, y);
            }
        };
        rectangle4.setBounds(1090, 550, 100, 50);

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
            prizeClaw1.setBounds(485, 25, 100, 150);
            prizeClaw1.setOpaque(false);
            layeredPane.add(prizeClaw1, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name1,485 + 22, 25 + 140), Integer.valueOf(5));
            }
        else if(User.prizeClaw1_2) {
            PrizeClawPanel prizeClaw1 = new PrizeClawPanel(1);
            prizeClaw1.setBounds(485, 25, 100, 150);
            prizeClaw1.setOpaque(false);
            layeredPane.add(prizeClaw1, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name2,485 + 22, 25 + 140), Integer.valueOf(5));
        }


        if(User.prizeClaw2_1) {
            PrizeClawPanel prizeClaw2 = new PrizeClawPanel(2);
            prizeClaw2.setBounds(570, 25, 100, 150);
            prizeClaw2.setOpaque(false);
            layeredPane.add(prizeClaw2, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name1,570 + 22, 25 + 140), Integer.valueOf(5));
        }
        else if(User.prizeClaw2_2) {
            PrizeClawPanel prizeClaw2 = new PrizeClawPanel(2);
            prizeClaw2.setBounds(570, 25, 100, 150);
            prizeClaw2.setOpaque(false);
            layeredPane.add(prizeClaw2, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name2,570 + 22, 25 + 140), Integer.valueOf(5));
        }


        if(User.prizeClaw3_1) {
            PrizeClawPanel prizeClaw3 = new PrizeClawPanel(3);
            prizeClaw3.setBounds(655, 25, 100, 150);
            prizeClaw3.setOpaque(false);
            layeredPane.add(prizeClaw3, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name1,655 + 22, 25 + 140), Integer.valueOf(5));
        }
        else if(User.prizeClaw3_2) {
            PrizeClawPanel prizeClaw3 = new PrizeClawPanel(3);
            prizeClaw3.setBounds(655, 25, 100, 150);
            prizeClaw3.setOpaque(false);
            layeredPane.add(prizeClaw3, Integer.valueOf(4));
            layeredPane.add(createRectangleName(User.Name2,655 + 22, 25 + 140), Integer.valueOf(5));
        }












        if(User.cardPanel11_1 > 0 || User.cardPanel11_2 > 0) {
            CardPanelOne cardPanel11 = new CardPanelOne(1);
            cardPanel11.setBounds(50, 180, 100, 150);
            cardPanel11.setOpaque(false);
            layeredPane.add(cardPanel11, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel11_1,75 , 180 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel11_2,75 + 25, 180 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel12_1 > 0 || User.cardPanel12_2 > 0) {
            CardPanelOne cardPanel12 = new CardPanelOne(2);
            cardPanel12.setBounds(135, 180, 100, 150);
            cardPanel12.setOpaque(false);
            layeredPane.add(cardPanel12, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel12_1,160 , 180 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel12_2,160 + 25, 180 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel13_1 > 0 || User.cardPanel13_2 > 0) {
            CardPanelOne cardPanel13 = new CardPanelOne(3);
            cardPanel13.setBounds(220, 180, 100, 150);
            cardPanel13.setOpaque(false);
            layeredPane.add(cardPanel13, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel13_1,245 , 180 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel13_2,245 + 25, 180 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel14_1 > 0 || User.cardPanel14_2 > 0) {
            CardPanelOne cardPanel14 = new CardPanelOne(4);
            cardPanel14.setBounds(305, 180, 100, 150);
            cardPanel14.setOpaque(false);
            layeredPane.add(cardPanel14, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel14_1,330 , 180 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel14_2,330 + 25, 180 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel15_1 > 0 || User.cardPanel15_2 > 0) {
            CardPanelOne cardPanel15 = new CardPanelOne(5);
            cardPanel15.setBounds(390, 180, 100, 150);
            cardPanel15.setOpaque(false);
            layeredPane.add(cardPanel15, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel15_1,415 , 180 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel15_2,415 + 25, 180 + 130), Integer.valueOf(5));
        }








        if(User.cardPanel21_1 > 0 || User.cardPanel21_2 > 0) {
            CardPanelTwo cardPanel21 = new CardPanelTwo(1);
            cardPanel21.setBounds(50, 340, 100, 150);
            cardPanel21.setOpaque(false);
            layeredPane.add(cardPanel21, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel21_1,75 , 340 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel21_2,75 + 25, 340 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel22_1 > 0 || User.cardPanel22_2 > 0) {
            CardPanelTwo cardPanel22 = new CardPanelTwo(2);
            cardPanel22.setBounds(135, 340, 100, 150);
            cardPanel22.setOpaque(false);
            layeredPane.add(cardPanel22, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel22_1,160 , 340 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel22_2,160 + 25, 340 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel23_1 > 0 || User.cardPanel23_2 > 0) {
            CardPanelTwo cardPanel23 = new CardPanelTwo(3);
            cardPanel23.setBounds(220, 340, 100, 150);
            cardPanel23.setOpaque(false);
            layeredPane.add(cardPanel23, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel23_1,245 , 340 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel23_2,245 + 25, 340 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel24_1 > 0 || User.cardPanel24_2 > 0) {
            CardPanelTwo cardPanel24 = new CardPanelTwo(4);
            cardPanel24.setBounds(305, 340, 100, 150);
            cardPanel24.setOpaque(false);
            layeredPane.add(cardPanel24, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel24_1,330 , 340 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel24_2,330 + 25, 340 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel25_1 > 0 || User.cardPanel25_2 > 0) {
            CardPanelTwo cardPanel25 = new CardPanelTwo(5);
            cardPanel25.setBounds(390, 340, 100, 150);
            cardPanel25.setOpaque(false);
            layeredPane.add(cardPanel25, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel25_1,415 , 340 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel25_2,415 + 25, 340 + 130), Integer.valueOf(5));
        }







        if(User.cardPanel31_1 > 0 || User.cardPanel31_2 > 0) {
            CardPanelThree cardPanel31 = new CardPanelThree(1);
            cardPanel31.setBounds(50, 500, 100, 150);
            cardPanel31.setOpaque(false);
            layeredPane.add(cardPanel31, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel31_1,75 , 500 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel31_2,75 + 25, 500 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel32_1 > 0 || User.cardPanel32_2 > 0) {
            CardPanelThree cardPanel32 = new CardPanelThree(2);
            cardPanel32.setBounds(135, 500, 100, 150);
            cardPanel32.setOpaque(false);
            layeredPane.add(cardPanel32, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel32_1,160 , 500 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel32_2,160 + 25, 500 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel33_1 > 0 || User.cardPanel33_2 > 0) {
            CardPanelThree cardPanel33 = new CardPanelThree(3);
            cardPanel33.setBounds(220, 500, 100, 150);
            cardPanel33.setOpaque(false);
            layeredPane.add(cardPanel33, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel33_1,245 , 500 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel33_2,245 + 25, 500 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel34_1 > 0 || User.cardPanel34_2 > 0) {
            CardPanelThree cardPanel34 = new CardPanelThree(4);
            cardPanel34.setBounds(305, 500, 100, 150);
            cardPanel34.setOpaque(false);
            layeredPane.add(cardPanel34, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel34_1,330 , 500 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel34_2,330 + 25, 500 + 130), Integer.valueOf(5));
        }

        if(User.cardPanel35_1 > 0 || User.cardPanel35_2 > 0) {
            CardPanelThree cardPanel35 = new CardPanelThree(5);
            cardPanel35.setBounds(390, 500, 100, 150);
            cardPanel35.setOpaque(false);
            layeredPane.add(cardPanel35, Integer.valueOf(4));
            layeredPane.add(createRectangle1(User.cardPanel35_1,415 , 500 + 130), Integer.valueOf(5));
            layeredPane.add(createRectangle2(User.cardPanel35_2,415 + 25, 500 + 130), Integer.valueOf(5));
        }






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
                g.setColor(Color.green);
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
                g.setColor(new Color(255,0,145));
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
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
                g.setColor(Color.orange);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.blue);
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