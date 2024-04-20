import javax.swing.*;
import java.awt.*;

public class Store extends JFrame {
    public Image backgroundImage;;


    public Store() {

        setTitle("Store");
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






        PrizeClawPanel prizeClaw1 = new PrizeClawPanel(1);
        prizeClaw1.setBounds(585, 50, 100, 150);
        prizeClaw1.setOpaque(false);
        layeredPane.add(prizeClaw1, Integer.valueOf(2));


        PrizeClawPanel prizeClaw2 = new PrizeClawPanel(2);
        prizeClaw2.setBounds(670, 50, 100, 150);
        prizeClaw2.setOpaque(false);
        layeredPane.add(prizeClaw2, Integer.valueOf(2));


        PrizeClawPanel prizeClaw3 = new PrizeClawPanel(3);
        prizeClaw3.setBounds(755, 50, 100, 150);
        prizeClaw3.setOpaque(false);
        layeredPane.add(prizeClaw3, Integer.valueOf(2));




        CardPanelOne cardPanel11 = new CardPanelOne(1);
        cardPanel11.setBounds(500, 180, 100, 150);
        cardPanel11.setOpaque(false);
        layeredPane.add(cardPanel11, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel11.numberCard11,540, 310), Integer.valueOf(3));


        CardPanelOne cardPanel12 = new CardPanelOne(2);
        cardPanel12.setBounds(585, 180, 100, 150);
        cardPanel12.setOpaque(false);
        layeredPane.add(cardPanel12, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel12.numberCard12,625, 310), Integer.valueOf(3));


        CardPanelOne cardPanel13 = new CardPanelOne(3);
        cardPanel13.setBounds(670, 180, 100, 150);
        cardPanel13.setOpaque(false);
        layeredPane.add(cardPanel13, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel13.numberCard13,710, 310), Integer.valueOf(3));


        CardPanelOne cardPanel14 = new CardPanelOne(4);
        cardPanel14.setBounds(755, 180, 100, 150);
        cardPanel14.setOpaque(false);
        layeredPane.add(cardPanel14, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel14.numberCard14,795, 310), Integer.valueOf(3));


        CardPanelOne cardPanel15 = new CardPanelOne(5);
        cardPanel15.setBounds(840, 180, 100, 150);
        cardPanel15.setOpaque(false);
        layeredPane.add(cardPanel15, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel15.numberCard15,880, 310), Integer.valueOf(3));


        CardPanelTwo cardPanel21 = new CardPanelTwo(1);
        cardPanel21.setBounds(500, 340, 100, 150);
        cardPanel21.setOpaque(false);
        layeredPane.add(cardPanel21, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel21.numberCard21,540, 470), Integer.valueOf(3));


        CardPanelTwo cardPanel22 = new CardPanelTwo(2);
        cardPanel22.setBounds(585, 340, 100, 150);
        cardPanel22.setOpaque(false);
        layeredPane.add(cardPanel22, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel22.numberCard22,625, 470), Integer.valueOf(3));


        CardPanelTwo cardPanel23 = new CardPanelTwo(3);
        cardPanel23.setBounds(670, 340, 100, 150);
        cardPanel23.setOpaque(false);
        layeredPane.add(cardPanel23, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel23.numberCard23,710, 470), Integer.valueOf(3));


        CardPanelTwo cardPanel24 = new CardPanelTwo(4);
        cardPanel24.setBounds(755, 340, 100, 150);
        cardPanel24.setOpaque(false);
        layeredPane.add(cardPanel24, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel24.numberCard24,795, 470), Integer.valueOf(3));


        CardPanelTwo cardPanel25 = new CardPanelTwo(5);
        cardPanel25.setBounds(840, 340, 100, 150);
        cardPanel25.setOpaque(false);
        layeredPane.add(cardPanel25, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel25.numberCard25,880, 470), Integer.valueOf(3));


        CardPanelThree cardPanel31 = new CardPanelThree(1);
        cardPanel31.setBounds(500, 500, 100, 150);
        cardPanel31.setOpaque(false);
        layeredPane.add(cardPanel31, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel31.numberCard31,540, 630), Integer.valueOf(3));


        CardPanelThree cardPanel32 = new CardPanelThree(2);
        cardPanel32.setBounds(585, 500, 100, 150);
        cardPanel32.setOpaque(false);
        layeredPane.add(cardPanel32, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel32.numberCard32,625, 630), Integer.valueOf(3));


        CardPanelThree cardPanel33 = new CardPanelThree(3);
        cardPanel33.setBounds(670, 500, 100, 150);
        cardPanel33.setOpaque(false);
        layeredPane.add(cardPanel33, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel33.numberCard33,710, 630), Integer.valueOf(3));


        CardPanelThree cardPanel34 = new CardPanelThree(4);
        cardPanel34.setBounds(755, 500, 100, 150);
        cardPanel34.setOpaque(false);
        layeredPane.add(cardPanel34, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel34.numberCard34,795, 630), Integer.valueOf(3));


        CardPanelThree cardPanel35 = new CardPanelThree(5);
        cardPanel35.setBounds(840, 500, 100, 150);
        cardPanel35.setOpaque(false);
        layeredPane.add(cardPanel35, Integer.valueOf(2));
        layeredPane.add(createRectangle(cardPanel35.numberCard35,880, 630), Integer.valueOf(3));



        CoinPanel redSlot = new CoinPanel(1);
        redSlot.setBounds(250, 50, 100, 100);
        redSlot.setOpaque(false);
        layeredPane.add(redSlot, Integer.valueOf(2));
        CoinPanel redCoin = new CoinPanel(2);
        redCoin.setBounds(200, 75, 100, 100);
        redCoin.setOpaque(false);
        layeredPane.add(redCoin, Integer.valueOf(2));


        CoinPanel greenSlot = new CoinPanel(3);
        greenSlot.setBounds(250, 150, 100, 100);
        greenSlot.setOpaque(false);
        layeredPane.add(greenSlot, Integer.valueOf(2));
        CoinPanel greenCoin = new CoinPanel(4);
        greenCoin.setBounds(200, 175, 100, 100);
        greenCoin.setOpaque(false);
        layeredPane.add(greenCoin, Integer.valueOf(2));


        CoinPanel blueSlot = new CoinPanel(5);
        blueSlot.setBounds(250, 250, 100, 100);
        blueSlot.setOpaque(false);
        layeredPane.add(blueSlot, Integer.valueOf(2));
        CoinPanel blueCoin = new CoinPanel(6);
        blueCoin.setBounds(200, 275, 100, 100);
        blueCoin.setOpaque(false);
        layeredPane.add(blueCoin, Integer.valueOf(2));


        CoinPanel whiteSlot = new CoinPanel(7);
        whiteSlot.setBounds(250, 350, 100, 100);
        whiteSlot.setOpaque(false);
        layeredPane.add(whiteSlot, Integer.valueOf(2));
        CoinPanel whiteCoin = new CoinPanel(8);
        whiteCoin.setBounds(200, 375, 100, 100);
        whiteCoin.setOpaque(false);
        layeredPane.add(whiteCoin, Integer.valueOf(2));


        CoinPanel blackSlot = new CoinPanel(9);
        blackSlot.setBounds(250, 450, 100, 100);
        blackSlot.setOpaque(false);
        layeredPane.add(blackSlot, Integer.valueOf(2));
        CoinPanel blackCoin = new CoinPanel(10);
        blackCoin.setBounds(200, 475, 100, 100);
        blackCoin.setOpaque(false);
        layeredPane.add(blackCoin, Integer.valueOf(2));


        CoinPanel goldCoin = new CoinPanel(12);
        goldCoin.setBounds(225, 575, 100, 100);
        goldCoin.setOpaque(false);
        layeredPane.add(goldCoin, Integer.valueOf(2));



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




    private JPanel createRectangle(int n, int x, int y) {
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
}