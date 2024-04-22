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



        CoinPanel redCoin1 = new CoinPanel(14);
        redCoin1.setBounds(100, 375, 100, 100);
        redCoin1.setOpaque(false);
        add(redCoin1);

        CoinPanel redCoin2 = new CoinPanel(16);
        redCoin2.setBounds(200, 375, 100, 100);
        redCoin2.setOpaque(false);
        add(redCoin2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw background image
        g.drawImage(scoreboardBackgroundImage, 0, 0, getWidth(), getHeight(), this);
        // Draw text
        g.setColor(new Color(0,255,247));
        Font font = new Font("Arial", Font.PLAIN, 18);
        g.setFont(font);

        g.drawString(User.Name1 + " :", 20, 20);
        g.drawString(User.Name2 + " :", 20, 206);

        g.drawString("Score: " + User.Score1, 20, 50);
        g.drawString("Score: " + User.Score2, 20, 236);


        if(User.sw1 == 1) {
            g.setColor(Color.green);
            g.drawString("Turn: " + User.turn, 20, 415);
        }
        else if(User.sw2 == 1) {
            g.setColor(new Color(255,0,145));
            g.drawString("Turn: " + User.turn, 20, 415);
        }


        g.setColor(new Color(179, 0, 18));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); // Increase the thickness of the line to 3 pixels
        g2d.drawLine(0, 185, getWidth(), 185);

        Graphics2D g3d = (Graphics2D) g;
        g3d.setStroke(new BasicStroke(3)); // Increase the thickness of the line to 3 pixels
        g3d.drawLine(0, 390, getWidth(), 390);

    }

//    private int calculatePlayerScore(int playerNumber) {
//        int score = 0;
//        if(playerNumber == 1) {
//            score += User.numberRedCoin1 + User.numberGreenCoin1 + User.numberBlueCoin1 +
//                    User.numberWhiteCoin1 + User.numberBlackCoin1 + User.numberGoldCoin1;
//        }
//        else if(playerNumber == 2) {
//            score += User.numberRedCoin2 + User.numberGreenCoin2 + User.numberBlueCoin2 +
//                    User.numberWhiteCoin2 + User.numberBlackCoin2 + User.numberGoldCoin2;
//        }
//        return score;
//    }
}