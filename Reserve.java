import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Reserve extends JFrame {
    public Image backgroundImage;;

    public final int x = 280, y = 105;




    public Reserve() {

        setTitle("Reserve");
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

        if(User.cardReserve1_1 != null){

            drawCard(User.cardReserve1_1, layeredPane, x, y);
        }
        if(User.cardReserve2_1 != null){

            drawCard(User.cardReserve2_1, layeredPane, x + 90, y);
        }
        if(User.cardReserve3_1 != null){

            drawCard(User.cardReserve3_1, layeredPane, x + 180, y);
        }




        if(User.cardReserve1_2 != null){

            drawCard(User.cardReserve1_2, layeredPane, x, y + 400);
        }
        if(User.cardReserve2_2 != null){

            drawCard(User.cardReserve2_2, layeredPane, x + 90, y + 400);
        }
        if(User.cardReserve3_2 != null){

            drawCard(User.cardReserve3_2, layeredPane, x + 180, y + 400);
        }




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
        rectangle1.setBounds(360, 50, 100, 50);
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
        rectangle2.setBounds(360, 450, 100, 50);
        layeredPane.add(rectangle2, Integer.valueOf(3));




        JPanel rectangleBack = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(103, 23, 201));
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.white);
                Font font = new Font("Arial", Font.PLAIN, 18);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth("Back")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString("Back", x, y);
            }
        };
        rectangleBack.setBounds(1035, 500, 150, 100);
        rectangleBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                Store store = new Store();
                store.setVisible(true);
            }
        });
        layeredPane.add(rectangleBack, Integer.valueOf(3));






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

    public void drawCard(String CardName, JLayeredPane layeredPane, int x, int y) {
        switch(CardName) {
            case "cardPanel11":
                CardPanelOne cardPanel11 = new CardPanelOne(1);
                cardPanel11.setBounds(x, y, 100, 150);
                cardPanel11.setOpaque(false);
                layeredPane.add(cardPanel11, Integer.valueOf(3));
                break;

            case "cardPanel12":
                CardPanelOne cardPanel12 = new CardPanelOne(2);
                cardPanel12.setBounds(x, y, 100, 150);
                cardPanel12.setOpaque(false);
                layeredPane.add(cardPanel12, Integer.valueOf(3));
                break;

            case "cardPanel13":
                CardPanelOne cardPanel13 = new CardPanelOne(3);
                cardPanel13.setBounds(x, y, 100, 150);
                cardPanel13.setOpaque(false);
                layeredPane.add(cardPanel13, Integer.valueOf(3));
                break;

            case "cardPanel14":
                CardPanelOne cardPanel14 = new CardPanelOne(4);
                cardPanel14.setBounds(x, y, 100, 150);
                cardPanel14.setOpaque(false);
                layeredPane.add(cardPanel14, Integer.valueOf(3));
                break;

            case "cardPanel15":
                CardPanelOne cardPanel15 = new CardPanelOne(5);
                cardPanel15.setBounds(x, y, 100, 150);
                cardPanel15.setOpaque(false);
                layeredPane.add(cardPanel15, Integer.valueOf(3));
                break;

            case "cardPanel21":
                CardPanelTwo cardPanel21 = new CardPanelTwo(1);
                cardPanel21.setBounds(x, y, 100, 150);
                cardPanel21.setOpaque(false);
                layeredPane.add(cardPanel21, Integer.valueOf(3));
                break;

            case "cardPanel22":
                CardPanelTwo cardPanel22 = new CardPanelTwo(2);
                cardPanel22.setBounds(x, y, 100, 150);
                cardPanel22.setOpaque(false);
                layeredPane.add(cardPanel22, Integer.valueOf(3));

            case "cardPanel23":
                CardPanelTwo cardPanel23 = new CardPanelTwo(3);
                cardPanel23.setBounds(x, y, 100, 150);
                cardPanel23.setOpaque(false);
                layeredPane.add(cardPanel23, Integer.valueOf(3));
                break;

            case "cardPanel24":
                CardPanelTwo cardPanel24 = new CardPanelTwo(4);
                cardPanel24.setBounds(x, y, 100, 150);
                cardPanel24.setOpaque(false);
                layeredPane.add(cardPanel24, Integer.valueOf(3));
                break;

            case "cardPanel25":
                CardPanelTwo cardPanel25 = new CardPanelTwo(5);
                cardPanel25.setBounds(x, y, 100, 150);
                cardPanel25.setOpaque(false);
                layeredPane.add(cardPanel25, Integer.valueOf(3));
                break;

            case "cardPanel31":
                CardPanelThree cardPanel31 = new CardPanelThree(1);
                cardPanel31.setBounds(x, y, 100, 150);
                cardPanel31.setOpaque(false);
                layeredPane.add(cardPanel31, Integer.valueOf(3));
                break;

            case "cardPanel32":
                CardPanelThree cardPanel32 = new CardPanelThree(2);
                cardPanel32.setBounds(x, y, 100, 150);
                cardPanel32.setOpaque(false);
                layeredPane.add(cardPanel32, Integer.valueOf(3));
                break;

            case "cardPanel33":
                CardPanelThree cardPanel33 = new CardPanelThree(3);
                cardPanel33.setBounds(x, y, 100, 150);
                cardPanel33.setOpaque(false);
                layeredPane.add(cardPanel33, Integer.valueOf(3));
                break;

            case "cardPanel34":
                CardPanelThree cardPanel34 = new CardPanelThree(4);
                cardPanel34.setBounds(x, y, 100, 150);
                cardPanel34.setOpaque(false);
                layeredPane.add(cardPanel34, Integer.valueOf(3));
                break;

            case "cardPanel35":
                CardPanelThree cardPanel35 = new CardPanelThree(5);
                cardPanel35.setBounds(x, y, 100, 150);
                cardPanel35.setOpaque(false);
                layeredPane.add(cardPanel35, Integer.valueOf(3));

        }
    }

}