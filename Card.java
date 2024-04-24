import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Card extends JPanel {
    private final ImageIcon icon1, icon2, icon3, icon4, icon5;
    private final boolean card11, card12, card13, card14, card15;
    private final boolean card21, card22, card23, card24, card25;
    private final boolean card31, card32, card33, card34, card35;
    public static int clickCount11 = 3, clickCount12 = 3, clickCount13 = 3, clickCount14 = 3, clickCount15 = 3;
    public static int clickCount21 = 3, clickCount22 = 3, clickCount23 = 3, clickCount24 = 3, clickCount25 = 3;
    public static int clickCount31 = 3, clickCount32 = 3, clickCount33 = 3, clickCount34 = 3, clickCount35 = 3;
    private final String text;
    public int sw = 1; // switch for when user can give a card then dispose store page


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

                            showBox(frame);
                        }
                    }
                    else if(card12) {
                        if (clickCount12 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card13) {
                        if (clickCount13 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card14) {
                        if (clickCount14 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card15) {
                        if (clickCount15 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card21) {
                        if (clickCount21 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card22) {
                        if (clickCount22 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card23) {
                        if (clickCount23 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card24) {
                        if (clickCount24 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card25) {
                        if (clickCount25 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card31) {
                        if (clickCount31 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card32) {
                        if (clickCount32 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card33) {
                        if (clickCount33 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card34) {
                        if (clickCount34 > 0) {

                            showBox(frame);
                        }
                    }
                    else if(card35) {
                        if (clickCount35 > 0) {

                            showBox(frame);
                        }
                    }
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Card.this);

        if (frame.getTitle().equals("Store")) {

            if ((card11 && clickCount11 <= 0) || (card12 && clickCount12 <= 0) || (card13 && clickCount13 <= 0) || (card14 && clickCount14 <= 0) || (card15 && clickCount15 <= 0)
                    || (card21 && clickCount21 <= 0) || (card22 && clickCount22 <= 0) || (card23 && clickCount23 <= 0) || (card24 && clickCount24 <= 0) || (card25 && clickCount25 <= 0)
                    || (card31 && clickCount31 <= 0) || (card32 && clickCount32 <= 0) || (card33 && clickCount33 <= 0) || (card34 && clickCount34 <= 0) || (card35 && clickCount35 <= 0)) {

                g.setColor(Color.red);
                g.fillRect(0, 0, getWidth(), getHeight());
            } else {

                g.setColor(new Color(244, 189, 247));
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.red);
                g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

                g.setColor(Color.BLACK);
                g.drawString(text, 10, 20);

                if ((clickCount11 > 0) || (clickCount12 > 0) || (clickCount13 > 0) || (clickCount14 > 0) || (clickCount15 > 0)
                        || (clickCount21 > 0) || (clickCount22 > 0) || (clickCount23 > 0) || (clickCount24 > 0) || (clickCount25 > 0)
                        || (clickCount31 > 0) || (clickCount32 > 0) || (clickCount33 > 0) || (clickCount34 > 0) || (clickCount35 > 0)) {

                    g.drawImage(icon1.getImage(), (getWidth() - 40) / 2, (getHeight() - 40) / 2, 40, 40, this);
                    g.drawImage(icon2.getImage(), 55, 5, 20, 20, this);
                    g.drawImage(icon3.getImage(), 5, 95, 20, 20, this);
                    g.drawImage(icon4.getImage(), 30, 95, 20, 20, this);
                    g.drawImage(icon5.getImage(), 55, 95, 20, 20, this);
                }
            }
        }
        else {
            g.setColor(new Color(244, 189, 247));
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

            g.setColor(Color.BLACK);
            g.drawString(text, 10, 20);

            if ((clickCount11 > 0) || (clickCount12 > 0) || (clickCount13 > 0) || (clickCount14 > 0) || (clickCount15 > 0)
                    || (clickCount21 > 0) || (clickCount22 > 0) || (clickCount23 > 0) || (clickCount24 > 0) || (clickCount25 > 0)
                    || (clickCount31 > 0) || (clickCount32 > 0) || (clickCount33 > 0) || (clickCount34 > 0) || (clickCount35 > 0)) {

                g.drawImage(icon1.getImage(), (getWidth() - 40) / 2, (getHeight() - 40) / 2, 40, 40, this);
                g.drawImage(icon2.getImage(), 55, 5, 20, 20, this);
                g.drawImage(icon3.getImage(), 5, 95, 20, 20, this);
                g.drawImage(icon4.getImage(), 30, 95, 20, 20, this);
                g.drawImage(icon5.getImage(), 55, 95, 20, 20, this);
            }
        }
    }

    private void showBox(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "Menu", true); // Parent frame, title, and modal
        dialog.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink); // Set background color
        panel.setLayout(new GridLayout(3, 1)); // Set GridLayout for three components

        JLabel label = new JLabel("Which one?");
        label.setHorizontalAlignment(JLabel.CENTER); // Center align the label
        panel.add(label);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel for buttons

        JButton pickUpButton = new JButton("Pick up");
        pickUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose(); // Close the dialog when the button is clicked
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Card.this);


                if(User.sw1 == 1 && card11 && (User.numberGreenCoin1 + User.numberSpecialGreenCoin1) >= 2 && (User.numberRedCoin1 + User.numberSpecialRedCoin1) >= 2) {
                    User.cardPanel11_1++;
                    clickCount11--;

                    if(User.numberGreenCoin1 >= 2)
                        User.numberGreenCoin1 -= 2;
                    else if(User.numberGreenCoin1 == 1)
                        User.numberGreenCoin1 -= 1;

                    if(User.numberRedCoin1 >= 2)
                        User.numberRedCoin1 -= 2;
                    else if(User.numberRedCoin1 == 1)
                        User.numberRedCoin1 -= 1;

                    User.numberSpecialGreenCoin1++;
                    sw = 0;

                }
                else if(User.sw2 == 1 && card11 && (User.numberGreenCoin2 + User.numberSpecialGreenCoin2) >= 2 && (User.numberRedCoin2 + User.numberSpecialRedCoin2) >= 2) {
                    User.cardPanel11_2++;
                    clickCount11--;

                    if(User.numberGreenCoin2 >= 2)
                        User.numberGreenCoin2 -= 2;
                    else if(User.numberGreenCoin2 == 1)
                        User.numberGreenCoin2 -= 1;

                    if(User.numberRedCoin2 >= 2)
                        User.numberRedCoin2 -= 2;
                    else if(User.numberRedCoin2 == 1)
                        User.numberRedCoin2 -= 1;

                    User.numberSpecialGreenCoin2++;
                    sw = 0;

                }

                if(User.sw1 == 1 && card12) {
                    User.cardPanel12_1++;
                    clickCount12--;
                }
                else if(User.sw2 == 1 && card12) {
                    User.cardPanel12_2++;
                    clickCount12--;
                }

                if(User.sw1 == 1 && card13) {
                    User.cardPanel13_1++;
                    clickCount13--;
                    User.Score1++;
                }
                else if(User.sw2 == 1 && card13) {
                    User.cardPanel13_2++;
                    clickCount13--;
                    User.Score2++;
                }

                if(User.sw1 == 1 && card14) {
                    User.cardPanel14_1++;
                    clickCount14--;
                    User.Score1++;
                }
                else if(User.sw2 == 1 && card14) {
                    User.cardPanel14_2++;
                    clickCount14--;
                    User.Score2++;
                }
                if(User.sw1 == 1 && card15) {
                    User.cardPanel15_1++;
                    clickCount15--;
                    User.Score1++;
                }
                else if(User.sw2 == 1 && card15) {
                    User.cardPanel15_2++;
                    clickCount15--;
                    User.Score2++;
                }






                if(User.sw1 == 1 && card21) {
                    User.cardPanel21_1++;
                    clickCount21--;
                    User.Score1 += 2;
                }
                else if(User.sw2 == 1 && card21) {
                    User.cardPanel21_2++;
                    clickCount21--;
                    User.Score2 += 2;
                }

                if(User.sw1 == 1 && card22) {
                    User.cardPanel22_1++;
                    clickCount22--;
                    User.Score1 += 2;
                }
                else if(User.sw2 == 1 && card22) {
                    User.cardPanel22_2++;
                    clickCount22--;
                    User.Score2 += 2;
                }

                if(User.sw1 == 1 && card23) {
                    User.cardPanel23_1++;
                    clickCount23--;
                    User.Score1 += 3;
                }
                else if(User.sw2 == 1 && card23) {
                    User.cardPanel23_2++;
                    clickCount23--;
                    User.Score2 += 3;
                }

                if(User.sw1 == 1 && card24) {
                    User.cardPanel24_1++;
                    clickCount24--;
                    User.Score1 += 3;
                }
                else if(User.sw2 == 1 && card24) {
                    User.cardPanel24_2++;
                    clickCount24--;
                    User.Score2 += 3;
                }
                if(User.sw1 == 1 && card25) {
                    User.cardPanel25_1++;
                    clickCount25--;
                    User.Score1 += 4;
                }
                else if(User.sw2 == 1 && card25) {
                    User.cardPanel25_2++;
                    clickCount25--;
                    User.Score2 += 4;
                }






                if(User.sw1 == 1 && card31) {
                    User.cardPanel31_1++;
                    clickCount31--;
                    User.Score1 += 3;
                }
                else if(User.sw2 == 1 && card31) {
                    User.cardPanel31_2++;
                    clickCount31--;
                    User.Score2 += 3;
                }

                if(User.sw1 == 1 && card32) {
                    User.cardPanel32_1++;
                    clickCount32--;
                    User.Score1 += 3;
                }
                else if(User.sw2 == 1 && card32) {
                    User.cardPanel32_2++;
                    clickCount32--;
                    User.Score2 += 3;
                }

                if(User.sw1 == 1 && card33) {
                    User.cardPanel33_1++;
                    clickCount33--;
                    User.Score1 += 4;
                }
                else if(User.sw2 == 1 && card33) {
                    User.cardPanel33_2++;
                    clickCount33--;
                    User.Score2 += 4;
                }

                if(User.sw1 == 1 && card34) {
                    User.cardPanel34_1++;
                    clickCount34--;
                    User.Score1 += 4;
                }
                else if(User.sw2 == 1 && card34) {
                    User.cardPanel34_2++;
                    clickCount34--;
                    User.Score2 += 4;
                }
                if(User.sw1 == 1 && card35) {
                    User.cardPanel35_1++;
                    clickCount35--;
                    User.Score1 += 5;
                }
                else if(User.sw2 == 1 && card35) {
                    User.cardPanel35_2++;
                    clickCount35--;
                    User.Score2 += 5;
                }





                //if(sw == 0) {
                    frame.dispose();
                    JFrame gamePage = new GamePage();
                    gamePage.setVisible(true);
                //}
            }
        });
        buttonPanel.add(pickUpButton); // Add "Pick up" button to buttonPanel

        JButton dropButton = new JButton("Reserve");
        dropButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action for "Drop" button
            }
        });
        buttonPanel.add(dropButton); // Add "Drop" button to buttonPanel

        panel.add(buttonPanel); // Add buttonPanel to the main panel

        dialog.add(panel, BorderLayout.CENTER);
        dialog.setSize(200, 150); // Increase dialog size
        dialog.setLocationRelativeTo(parentFrame); // Center the dialog on the parent frame
        dialog.setVisible(true); // Show the dialog
    }



}