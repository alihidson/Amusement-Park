import javax.swing.*;
import java.awt.*;

public class Store extends JFrame {
    public Image backgroundImage;;


    public Store() {

        setTitle("Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 400);
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
