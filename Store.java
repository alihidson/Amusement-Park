import javax.swing.*;
import java.awt.*;

public class Store extends JFrame {
    public Image backgroundImage;;


    public Store() {

        setTitle("Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 740);
        setResizable(false);
        setLocationRelativeTo(null);


        backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/wood.jpg").getImage();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(700, 500));

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1280, 740);
        layeredPane.add(backgroundPanel, Integer.valueOf(1));

        CardPanelOne cardPanel11 = new CardPanelOne(1);
        cardPanel11.setBounds(300, 50, 500, 500);
        cardPanel11.setOpaque(false);
        layeredPane.add(cardPanel11, Integer.valueOf(2));

        CardPanelOne cardPanel12 = new CardPanelOne(2);
        cardPanel12.setBounds(385, 50, 500, 500);
        cardPanel12.setOpaque(false);
        layeredPane.add(cardPanel12, Integer.valueOf(2));


        CardPanelOne cardPanel13 = new CardPanelOne(3);
        cardPanel13.setBounds(470, 50, 500, 500);
        cardPanel13.setOpaque(false);
        layeredPane.add(cardPanel13, Integer.valueOf(2));


        CardPanelOne cardPanel14 = new CardPanelOne(4);
        cardPanel14.setBounds(555, 50, 500, 500);
        cardPanel14.setOpaque(false);
        layeredPane.add(cardPanel14, Integer.valueOf(2));


        CardPanelOne cardPanel15 = new CardPanelOne(5);
        cardPanel15.setBounds(640, 50, 500, 500);
        cardPanel15.setOpaque(false);
        layeredPane.add(cardPanel15, Integer.valueOf(2));


        CardPanelTwo cardPanel21 = new CardPanelTwo(1);
        cardPanel21.setBounds(300, 175, 500, 500);
        cardPanel21.setOpaque(false);
        layeredPane.add(cardPanel21, Integer.valueOf(2));


        CardPanelTwo cardPanel22 = new CardPanelTwo(2);
        cardPanel22.setBounds(385, 175, 500, 500);
        cardPanel22.setOpaque(false);
        layeredPane.add(cardPanel22, Integer.valueOf(2));


        CardPanelTwo cardPanel23 = new CardPanelTwo(3);
        cardPanel23.setBounds(470, 175, 500, 500);
        cardPanel23.setOpaque(false);
        layeredPane.add(cardPanel23, Integer.valueOf(2));


        CardPanelTwo cardPanel24 = new CardPanelTwo(4);
        cardPanel24.setBounds(555, 175, 500, 500);
        cardPanel24.setOpaque(false);
        layeredPane.add(cardPanel24, Integer.valueOf(2));


        CardPanelTwo cardPanel25 = new CardPanelTwo(5);
        cardPanel25.setBounds(640, 175, 500, 500);
        cardPanel25.setOpaque(false);
        layeredPane.add(cardPanel25, Integer.valueOf(2));



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
