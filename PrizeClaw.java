import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrizeClaw extends JPanel {
    private ImageIcon icon1;
    private ImageIcon icon2;
    private ImageIcon icon3;
    private ImageIcon icon4;
    private boolean PC1, PC2, PC3;
    private static int clickCount1 = 1, clickCount2 = 1, clickCount3 = 1;
    private String text;


    public PrizeClaw(String icon1Path, String icon2Path, String icon3Path, String icon4Path, String text) {
        icon1 = new ImageIcon(icon1Path);
        icon2 = new ImageIcon(icon2Path);
        icon3 = new ImageIcon(icon3Path);
        icon4 = new ImageIcon(icon4Path);
        this.text = text;


       // PC1 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/swingset.png"); // card11 being true

        setPreferredSize(new Dimension(80, 120));
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PrizeClaw.this);

                if (frame.getTitle().equals("Store")) {
                    if (PC1) {
                        if (clickCount1 > 0) {
                            clickCount1--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (PC1 && clickCount1 <= 0) {
            g.setColor(Color.red);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        else {

            g.setColor(new Color(255,210,168));
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

            g.setColor(Color.BLACK);
            g.drawString(text, 10, 20);

            if (!PC1 || (clickCount1 > 0)) {
                g.drawImage(icon1.getImage(), (getWidth() - 60) / 2, 20, 60, 60, this);
                g.drawImage(icon2.getImage(), 5, 95, 20, 20, this);
                g.drawImage(icon3.getImage(), 30, 95, 20, 20, this);
                g.drawImage(icon4.getImage(), 55, 95, 20, 20, this);
            }
        }
    }

}