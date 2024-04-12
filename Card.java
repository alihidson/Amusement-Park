import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Card extends JPanel {
    private ImageIcon icon1;
    private ImageIcon icon2;
    private ImageIcon icon3;
    private ImageIcon icon4;
    private ImageIcon icon5;
    private boolean card11, card12, card13, card14, card15;
    private boolean card21, card22, card23, card24, card25;
    private boolean card31, card32, card33, card34, card35;
    public static int clickCount11 = 3, clickCount12 = 3, clickCount13 = 3, clickCount14 = 3, clickCount15 = 3;
    public static int clickCount21 = 3, clickCount22 = 3, clickCount23 = 3, clickCount24 = 3, clickCount25 = 3;
    public static int clickCount31 = 3, clickCount32 = 3, clickCount33 = 3, clickCount34 = 3, clickCount35 = 3;
    private String text;


    public Card(String icon1Path, String icon2Path, String icon3Path, String icon4Path, String icon5Path, String text) {
        icon1 = new ImageIcon(icon1Path);
        icon2 = new ImageIcon(icon2Path);
        icon3 = new ImageIcon(icon3Path);
        icon4 = new ImageIcon(icon4Path);
        icon5 = new ImageIcon(icon5Path);

        this.text = text;


        card11 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/little-swingset.png"); // card being true
        card12 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/horse.png");
        card13 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/zoo.png");
        card14 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/circus.png");
        card15 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/firebreather.png");

        card21 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/cannon.png"); // card being true
        card22 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/waterPark.png");
        card23 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/swinging.png");
        card24 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/funfar.png");
        card25 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/train.png");

        card31 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/big-drop.png"); // card being true
        card32 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/car.png");
        card33 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/roller-coaster.png");
        card34 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/big-swingset.png");
        card35 = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/measure-strength.png");




        setPreferredSize(new Dimension(80, 120));
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Card.this);

                if (frame.getTitle().equals("Store")) {
                    if (card11) {
                        if (clickCount11 > 0) {
                            clickCount11--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card12) {
                        if (clickCount12 > 0) {
                            clickCount12--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card13) {
                        if (clickCount13 > 0) {
                            clickCount13--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card14) {
                        if (clickCount14 > 0) {
                            clickCount14--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card15) {
                        if (clickCount15 > 0) {
                            clickCount15--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card21) {
                        if (clickCount21 > 0) {
                            clickCount21--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card22) {
                        if (clickCount22 > 0) {
                            clickCount22--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card23) {
                        if (clickCount23 > 0) {
                            clickCount23--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card24) {
                        if (clickCount24 > 0) {
                            clickCount24--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card25) {
                        if (clickCount25 > 0) {
                            clickCount25--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card31) {
                        if (clickCount31 > 0) {
                            clickCount31--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card32) {
                        if (clickCount32 > 0) {
                            clickCount32--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card33) {
                        if (clickCount33 > 0) {
                            clickCount33--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card34) {
                        if (clickCount34 > 0) {
                            clickCount34--;
                            frame.dispose();
                            JFrame gamePage = new GamePage();
                            gamePage.setVisible(true);
                        }
                    }
                    else if(card35) {
                        if (clickCount35 > 0) {
                            clickCount35--;
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

        if ((card11 && clickCount11 <= 0) || (card12 && clickCount12 <= 0) || (card13 && clickCount13 <= 0) || (card14 && clickCount14 <= 0) || (card15 && clickCount15 <= 0)
         || (card21 && clickCount21 <= 0) || (card22 && clickCount22 <= 0) || (card23 && clickCount23 <= 0) || (card24 && clickCount24 <= 0) || (card25 && clickCount25 <= 0)
         || (card31 && clickCount31 <= 0) || (card32 && clickCount32 <= 0) || (card33 && clickCount33 <= 0) || (card34 && clickCount34 <= 0) || (card35 && clickCount35 <= 0)){

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

            if ((!card11 || clickCount11 > 0) || (!card12 || clickCount12 > 0) || (!card13 || clickCount13 > 0) || (!card14 || clickCount14 > 0) || (!card15 || clickCount15 > 0)
             || (!card21 || clickCount21 > 0) || (!card22 || clickCount22 > 0) || (!card23 || clickCount23 > 0) || (!card24 || clickCount24 > 0) || (!card25 || clickCount25 > 0)
             || (!card31 || clickCount31 > 0) || (!card32 || clickCount32 > 0) || (!card33 || clickCount33 > 0) || (!card34 || clickCount34 > 0) || (!card35 || clickCount35 > 0)){

                g.drawImage(icon1.getImage(), (getWidth() - 40) / 2, (getHeight() - 40) / 2, 40, 40, this);
                g.drawImage(icon2.getImage(), 55, 5, 20, 20, this);
                g.drawImage(icon3.getImage(), 5, 95, 20, 20, this);
                g.drawImage(icon4.getImage(), 30, 95, 20, 20, this);
                g.drawImage(icon5.getImage(), 55, 95, 20, 20, this);
            }
        }
    }

}