import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrizeClaw extends JPanel {
    private final ImageIcon icon1, icon2, icon3;
    private final ImageIcon icon4;
    private final boolean PC1, PC2, PC3;
    private static int clickCount1 = 1, clickCount2 = 1, clickCount3 = 1;
    private String text;


    public PrizeClaw(String icon1Path, String icon2Path, String icon3Path, String icon4Path, String text) {
        icon1 = new ImageIcon(icon1Path);
        icon2 = new ImageIcon(icon2Path);
        icon3 = new ImageIcon(icon3Path);
        icon4 = new ImageIcon(icon4Path);
        this.text = text;


        PC1 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/prize-claw-1.png"); // card being true
        PC2 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/prize-claw-2.png");
        PC3 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/prize-claw-3.png");


        setPreferredSize(new Dimension(80, 120));
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PrizeClaw.this);

                if (frame.getTitle().equals("Store")) {
                    if (PC1) {
                        if (clickCount1 > 0) {
                            if (User.sw1 == 1) {
                                clickCount1--;
                                User.prizeClaw1_1 = true;

                                frame.dispose();
                                JFrame gamePage = new GamePage();
                                gamePage.setVisible(true);
                            } else if (User.sw2 == 1) {
                                clickCount1--;
                                User.prizeClaw1_2 = true;

                                frame.dispose();
                                JFrame gamePage = new GamePage();
                                gamePage.setVisible(true);
                            }

                        }
                    } else if (PC2) {
                        if (clickCount2 > 0) {
                            if (User.sw1 == 1) {
                                clickCount2--;
                                User.prizeClaw2_1 = true;

                                frame.dispose();
                                JFrame gamePage = new GamePage();
                                gamePage.setVisible(true);
                            } else if (User.sw2 == 1) {
                                clickCount2--;
                                User.prizeClaw2_2 = true;

                                frame.dispose();
                                JFrame gamePage = new GamePage();
                                gamePage.setVisible(true);
                            }
                        }
                    } else if (PC3) {
                        if (clickCount3 > 0) {
                            if (User.sw1 == 1) {
                                clickCount3--;
                                User.prizeClaw3_1 = true;

                                frame.dispose();
                                JFrame gamePage = new GamePage();
                                gamePage.setVisible(true);
                            } else if (User.sw2 == 1) {
                                clickCount3--;
                                User.prizeClaw3_2 = true;

                                frame.dispose();
                                JFrame gamePage = new GamePage();
                                gamePage.setVisible(true);
                            }
                        }
                    }

                }
            }
        });
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Frame frame = (JFrame) SwingUtilities.getWindowAncestor(PrizeClaw.this);

        if (frame.getTitle().equals("Store")) {

            if ((PC1 && clickCount1 <= 0) || (PC2 && clickCount2 <= 0) || (PC3 && clickCount3 <= 0)) {
                g.setColor(Color.blue);
                g.fillRect(0, 0, getWidth(), getHeight());
            } else {

                g.setColor(new Color(255, 210, 168));
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.red);
                g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

                g.setColor(Color.BLACK);
                g.drawString(text, 10, 20);

                if ((!PC1 || clickCount1 > 0) || (!PC2 || clickCount2 > 0) || (!PC3 || clickCount3 > 0)) {
                    g.drawImage(icon1.getImage(), (getWidth() - 60) / 2, 20, 60, 60, this);
                    g.drawImage(icon2.getImage(), 5, 95, 20, 20, this);
                    g.drawImage(icon3.getImage(), 30, 95, 20, 20, this);
                    g.drawImage(icon4.getImage(), 55, 95, 20, 20, this);
                }
            }
        }
        else {
            g.setColor(new Color(255, 210, 168));
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

            g.setColor(Color.BLACK);
            g.drawString(text, 10, 20);

            if ((!PC1 || clickCount1 > 0) || (!PC2 || clickCount2 > 0) || (!PC3 || clickCount3 > 0)) {
                g.drawImage(icon1.getImage(), (getWidth() - 60) / 2, 20, 60, 60, this);
                g.drawImage(icon2.getImage(), 5, 95, 20, 20, this);
                g.drawImage(icon3.getImage(), 30, 95, 20, 20, this);
                g.drawImage(icon4.getImage(), 55, 95, 20, 20, this);
            }
        }

    }
}