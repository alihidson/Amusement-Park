import javax.swing.*;
import java.awt.*;

public class ScoreBoardPanel extends JPanel {

    private Image scoreboardBackgroundImage;

    public ScoreBoardPanel() {
        scoreboardBackgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/woodScore.jpg").getImage();
        setOpaque(false);
        setPreferredSize(new Dimension(350, 200));
        // Add a border around the panel
        setBorder(BorderFactory.createLineBorder(new Color(158, 72, 177), 4)); // Adjust color and thickness as needed

        setLayout(null);


        CoinPanel redCoin1 = new CoinPanel(14);
        redCoin1.setBounds(15, 80, 100, 100); // Change the position here
        redCoin1.setOpaque(false);
        add(redCoin1);
        CoinPanel redCoin2 = new CoinPanel(16);
        redCoin2.setBounds(15, 265, 100, 100); // Change the position here
        redCoin2.setOpaque(false);
        add(redCoin2);


        CoinPanel greenCoin1 = new CoinPanel(18);
        greenCoin1.setBounds(70, 80, 100, 100);
        greenCoin1.setOpaque(false);
        add(greenCoin1);
        CoinPanel greenCoin2 = new CoinPanel(20);
        greenCoin2.setBounds(70, 265, 100, 100);
        greenCoin2.setOpaque(false);
        add(greenCoin2);


        CoinPanel blueCoin1 = new CoinPanel(22);
        blueCoin1.setBounds(125, 80, 100, 100);
        blueCoin1.setOpaque(false);
        add(blueCoin1);
        CoinPanel blueCoin2 = new CoinPanel(24);
        blueCoin2.setBounds(125, 265, 100, 100);
        blueCoin2.setOpaque(false);
        add(blueCoin2);


        CoinPanel whiteCoin1 = new CoinPanel(26);
        whiteCoin1.setBounds(180, 80, 100, 100);
        whiteCoin1.setOpaque(false);
        add(whiteCoin1);
        CoinPanel whiteCoin2 = new CoinPanel(28);
        whiteCoin2.setBounds(180, 265, 100, 100);
        whiteCoin2.setOpaque(false);
        add(whiteCoin2);


        CoinPanel blackCoin1 = new CoinPanel(30);
        blackCoin1.setBounds(235, 80, 100, 100);
        blackCoin1.setOpaque(false);
        add(blackCoin1);
        CoinPanel blackCoin2 = new CoinPanel(32);
        blackCoin2.setBounds(235, 265, 100, 100);
        blackCoin2.setOpaque(false);
        add(blackCoin2);


        CoinPanel goldCoin1 = new CoinPanel(34);
        goldCoin1.setBounds(290, 90, 100, 100);
        goldCoin1.setOpaque(false);
        add(goldCoin1);
        CoinPanel goldCoin2 = new CoinPanel(36);
        goldCoin2.setBounds(290, 275, 100, 100);
        goldCoin2.setOpaque(false);
        add(goldCoin2);





        CoinPanel redSpecialCoin1 = new CoinPanel(38);
        redSpecialCoin1.setBounds(20, 130, 100, 100); // Change the position here
        redSpecialCoin1.setOpaque(false);
        add(redSpecialCoin1);
        CoinPanel redSpecialCoin2 = new CoinPanel(40);
        redSpecialCoin2.setBounds(20, 315, 100, 100); // Change the position here
        redSpecialCoin2.setOpaque(false);
        add(redSpecialCoin2);


        CoinPanel greenSpecialCoin1 = new CoinPanel(42);
        greenSpecialCoin1.setBounds(75, 130, 100, 100);
        greenSpecialCoin1.setOpaque(false);
        add(greenSpecialCoin1);
        CoinPanel greenSpecialCoin2 = new CoinPanel(44);
        greenSpecialCoin2.setBounds(75, 315, 100, 100);
        greenSpecialCoin2.setOpaque(false);
        add(greenSpecialCoin2);



        CoinPanel blueSpecialCoin1 = new CoinPanel(46);
        blueSpecialCoin1.setBounds(130, 130, 100, 100);
        blueSpecialCoin1.setOpaque(false);
        add(blueSpecialCoin1);
        CoinPanel blueSpecialCoin2 = new CoinPanel(48);
        blueSpecialCoin2.setBounds(130, 315, 100, 100);
        blueSpecialCoin2.setOpaque(false);
        add(blueSpecialCoin2);


        CoinPanel whiteSpecialCoin1 = new CoinPanel(50);
        whiteSpecialCoin1.setBounds(185, 130, 100, 100);
        whiteSpecialCoin1.setOpaque(false);
        add(whiteSpecialCoin1);
        CoinPanel whiteSpecialCoin2 = new CoinPanel(52);
        whiteSpecialCoin2.setBounds(185, 315, 100, 100);
        whiteSpecialCoin2.setOpaque(false);
        add(whiteSpecialCoin2);


        CoinPanel blackSpecialCoin1 = new CoinPanel(54);
        blackSpecialCoin1.setBounds(240, 130, 100, 100);
        blackSpecialCoin1.setOpaque(false);
        add(blackSpecialCoin1);
        CoinPanel blackSpecialCoin2 = new CoinPanel(56);
        blackSpecialCoin2.setBounds(240, 315, 100, 100);
        blackSpecialCoin2.setOpaque(false);
        add(blackSpecialCoin2);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw background image
        g.drawImage(scoreboardBackgroundImage, 0, 0, getWidth(), getHeight(), this);
        // Draw text
        g.setColor(new Color(0,255,247));
        Font font = new Font("Arial", Font.PLAIN, 22);
        g.setFont(font);

        g.drawString(User.Name1 + " :", 20, 20);
        g.drawString(User.Name2 + " :", 20, 206);

        g.drawString("Score: " + User.Score1, 20, 50);
        g.drawString("Score: " + User.Score2, 20, 236);


        if(User.sw1 == 1) {
            g.setColor(Color.green);
            g.drawString("Turn: " + User.turn, 20, 405);
        }
        else if(User.sw2 == 1) {
            g.setColor(new Color(255,0,145));
            g.drawString("Turn: " + User.turn, 20, 405);
        }


        g.setColor(new Color(179, 0, 18));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); // Increase the thickness of the line to 3 pixels
        g2d.drawLine(0, 185, getWidth(), 185);

        Graphics2D g3d = (Graphics2D) g;
        g3d.setStroke(new BasicStroke(3)); // Increase the thickness of the line to 3 pixels
        g3d.drawLine(0, 370, getWidth(), 370);

    }
}