import javax.swing.*;
import java.awt.*;

public class Store extends JFrame {
    public Image backgroundImage;;


    public Store() {

        setTitle("Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 740);
        setLocationRelativeTo(null);


        backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/wood.jpg").getImage();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(700, 500));

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setBounds(0, 0, 1280, 740);
        layeredPane.add(backgroundPanel, Integer.valueOf(1));

        CardPanelOne cardPanel1 = new CardPanelOne(1);
        cardPanel1.setBounds(300, 50, 500, 500);
        cardPanel1.setOpaque(false);
        layeredPane.add(cardPanel1, Integer.valueOf(2));

        CardPanelOne cardPanel2 = new CardPanelOne(2);
        cardPanel2.setBounds(385, 50, 500, 500);
        cardPanel2.setOpaque(false);
        layeredPane.add(cardPanel2, Integer.valueOf(2));


        CardPanelOne cardPanel3 = new CardPanelOne(3);
        cardPanel3.setBounds(470, 50, 500, 500);
        cardPanel3.setOpaque(false);
        layeredPane.add(cardPanel3, Integer.valueOf(2));


        CardPanelOne cardPanel4 = new CardPanelOne(4);
        cardPanel4.setBounds(555, 50, 500, 500);
        cardPanel4.setOpaque(false);
        layeredPane.add(cardPanel4, Integer.valueOf(2));


        CardPanelOne cardPanel5 = new CardPanelOne(5);
        cardPanel5.setBounds(640, 50, 500, 500);
        cardPanel5.setOpaque(false);
        layeredPane.add(cardPanel5, Integer.valueOf(2));


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
