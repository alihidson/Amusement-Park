import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class EndPage extends JPanel {

    public EndPage() {
        setLayout(null);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/wood.jpg").getImage();
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Adding text to the page
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File("/Users/ali/Main/Documents/Source/Amusement-Park/src/Font/PinyonScript-Regular.ttf")).deriveFont(Font.BOLD, 44);
            g.setFont(font);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        g.setColor(Color.red);
        String text = "Amusement Park is Finished" + "\n" + "The first player is: " + User.winPlayer;
        FontMetrics metrics = g.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(text)) / 2;
        int y = (getHeight() - metrics.getHeight()) / 2;
        g.drawString(text, x, y);

        int rectWidth = 300;
        int rectHeight = 50;
        int rectX = (getWidth() - rectWidth) / 2;
        int rectY = y + metrics.getHeight() + 20;
    }
}