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
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw background image
        g.drawImage(scoreboardBackgroundImage, 0, 0, getWidth(), getHeight(), this);
        // Draw text
        g.setColor(new Color(198, 230, 38));
        Font font = new Font("Arial", Font.PLAIN, 18);
        g.setFont(font);

        g.drawString(User.Name1 + " :", 20, 20);
        g.drawString(User.Name2 + " :", 20, 156);

        g.drawString("Score: " + calculatePlayerScore(1), 20, 50);
        g.drawString("Score: " + calculatePlayerScore(2), 20, 186);


        g.drawString("Turn: " + User.turn, 20, 340);


        g.setColor(new Color(255, 0, 255));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3)); // Increase the thickness of the line to 3 pixels
        g2d.drawLine(0, 135, getWidth(), 135);


    }

    private int calculatePlayerScore(int playerNumber) {
        int score = 0;
        if(playerNumber == 1) {
            score += User.numberRedCoin1 + User.numberGreenCoin1 + User.numberBlueCoin1 +
                    User.numberWhiteCoin1 + User.numberBlackCoin1 + User.numberGoldCoin1;
        }
        else if(playerNumber == 2) {
            score += User.numberRedCoin2 + User.numberGreenCoin2 + User.numberBlueCoin2 +
                    User.numberWhiteCoin2 + User.numberBlackCoin2 + User.numberGoldCoin2;
        }
        return score;
    }
}