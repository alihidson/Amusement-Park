import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardTwo extends JPanel {
    private ImageIcon icon1;
    private ImageIcon icon2;
    private ImageIcon icon3;
    private ImageIcon icon4;
    private boolean isCenterCard;
    private static int clickCount = 0;

    private String text;
    public CardTwo(String icon1Path, String icon2Path, String icon3Path, String icon4Path, String text) {
        icon1 = new ImageIcon(icon1Path);
        icon2 = new ImageIcon(icon2Path);
        icon3 = new ImageIcon(icon3Path);
        icon4 = new ImageIcon(icon4Path);

        this.text = text;


        if(icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/icons8-coin-58.png") && icon2Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/swing_image/icons8-roller-coaster-64.png")) {
            isCenterCard = true;
        }
        else {
            isCenterCard = false;
        }

        setPreferredSize(new Dimension(80, 120));
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(CardTwo.this);

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

            g.setColor(new Color(244,189,247));
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

            g.setColor(Color.BLACK);
            g.drawString(text, 10, 20);

            if (!isCenterCard || (isCenterCard && clickCount < 2)) {
                g.drawImage(icon1.getImage(), (getWidth() - 40) / 2, (getHeight() - 40) / 2, 40, 40, this);
                g.drawImage(icon2.getImage(), 55, 5, 20, 20, this);
                g.drawImage(icon3.getImage(), 5, 95, 20, 20, this);
                g.drawImage(icon4.getImage(), 30, 95, 20, 20, this);
            }
        }
    }

}