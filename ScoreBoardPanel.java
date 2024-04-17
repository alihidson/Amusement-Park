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
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, 12);
        g.setFont(font);
        g.drawString("Player 1 Score: " + calculatePlayerScore(1), 20, 20);
        g.drawString("Player 2 Score: " + calculatePlayerScore(2), 20, 40);
    }

    private int calculatePlayerScore(int playerNumber) {
        int score = 0;
        if (playerNumber == 1) {
            score += User.numberRedCoin1 + User.numberGreenCoin1 + User.numberBlueCoin1 +
                    User.numberWhiteCoin1 + User.numberBlackCoin1 + User.numberGoldCoin1;
        }
        else if (playerNumber == 2) {
            score += User.numberRedCoin2 + User.numberGreenCoin2 + User.numberBlueCoin2 +
                    User.numberWhiteCoin2 + User.numberBlackCoin2 + User.numberGoldCoin2;
        }
        return score;
    }
}