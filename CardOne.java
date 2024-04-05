import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardOne extends JPanel {
    private ImageIcon icon1;
    private ImageIcon icon2;
    private boolean isCenterCard;
    private static int clickCount = 0;

    public CardOne(String icon1Path, String icon2Path) {
        icon1 = new ImageIcon(icon1Path);
        icon2 = new ImageIcon(icon2Path);


        if(icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/icons8-coin-58.png") && icon2Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/icons8-roller-coaster-64.png")) {
            isCenterCard = true;
        }
        else {
            isCenterCard = false;
        }

        setPreferredSize(new Dimension(100, 140));
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(CardOne.this);

                if (frame.getTitle().equals("Store")) {
                    if (isCenterCard) {
                        if (clickCount < 2) {
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                            clickCount++;
                        }
                    }
                }
                else {
                    if(isCenterCard) {
                        JFrame storeFrame = new Store();
                        storeFrame.setVisible(true);
                    }
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (isCenterCard && clickCount >= 2) {
            g.setColor(Color.red);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        else {

            g.setColor(Color.green);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.BLACK);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

            if (!isCenterCard || (isCenterCard && clickCount < 2)) {
                g.drawImage(icon1.getImage(), 10, 10, 30, 30, this);
                g.drawImage(icon2.getImage(), 40, 60, 60, 50, this);
            }
        }
    }

}