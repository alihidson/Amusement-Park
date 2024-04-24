import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Coin extends JPanel {
    private final ImageIcon icon;
    public int n;

    public static int countGetCoin = 3;



    public static int numberRedCoin = 4;
    public static int numberGreenCoin = 4;
    public static int numberBlueCoin = 4;
    public static int numberWhiteCoin = 4;
    public static int numberBlackCoin = 4;
    public static int numberGoldCoin = 5;


    private final boolean redSlot, greenSlot, blueSlot, whiteSlot, blackSlot;




    public Coin(String icon1Path, int n) {
        icon = new ImageIcon(icon1Path);
        this.n = n;


        redSlot = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-red.png");
        greenSlot = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-green.png");
        blueSlot = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-blue.png");
        whiteSlot = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-white.png");
        blackSlot = icon1Path.contains("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-black.png");



        setPreferredSize(new Dimension(80, 80));
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Coin.this);

                    if (redSlot) {
                        if(User.sw1 == 1) {
                            if (countGetCoin > 0 && numberRedCoin == 4 && User.numberUserGetRedCoin == 0
                                    && User.numberUserGetGreenCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberRedCoin--;
                                User.numberRedCoin1++;
                                User.numberUserGetRedCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberRedCoin == 3 && User.numberUserGetRedCoin == 1
                                    && User.numberUserGetGreenCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberRedCoin--;
                                User.numberRedCoin1++;
                                User.numberUserGetRedCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberRedCoin <= 4 && numberRedCoin > 0 && User.numberUserGetRedCoin == 0 &&
                                    (User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberRedCoin--;
                                User.numberRedCoin1++;
                                User.numberUserGetRedCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                        else if(User.sw2 == 1) {
                            if (countGetCoin > 0 && numberRedCoin == 4 && User.numberUserGetRedCoin == 0
                                    && User.numberUserGetGreenCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberRedCoin--;
                                User.numberRedCoin2++;
                                User.numberUserGetRedCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberRedCoin == 3 && User.numberUserGetRedCoin == 1
                                    && User.numberUserGetGreenCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberRedCoin--;
                                User.numberRedCoin2++;
                                User.numberUserGetRedCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberRedCoin <= 4 && numberRedCoin > 0 && User.numberUserGetRedCoin == 0 &&
                                    (User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberRedCoin--;
                                User.numberRedCoin2++;
                                User.numberUserGetRedCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                    }


                    else if (greenSlot) {
                        if (User.sw1 == 1) {
                            if (countGetCoin > 0 && numberGreenCoin == 4 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberGreenCoin--;
                                User.numberGreenCoin1++;
                                User.numberUserGetGreenCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            } else if (countGetCoin > 0 && numberGreenCoin == 3 && User.numberUserGetGreenCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberGreenCoin--;
                                User.numberGreenCoin1++;
                                User.numberUserGetGreenCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            } else if (countGetCoin > 0 && numberGreenCoin <= 4 && numberGreenCoin > 0 && User.numberUserGetGreenCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberGreenCoin--;
                                User.numberGreenCoin1++;
                                User.numberUserGetGreenCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        } else if (User.sw2 == 1) {
                            if (countGetCoin > 0 && numberGreenCoin == 4 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberGreenCoin--;
                                User.numberGreenCoin2++;
                                User.numberUserGetGreenCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            } else if (countGetCoin > 0 && numberGreenCoin == 3 && User.numberUserGetGreenCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberGreenCoin--;
                                User.numberGreenCoin2++;
                                User.numberUserGetGreenCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            } else if (countGetCoin > 0 && numberGreenCoin <= 4 && numberGreenCoin > 0 && User.numberUserGetGreenCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberGreenCoin--;
                                User.numberGreenCoin2++;
                                User.numberUserGetGreenCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                    }


                    else if (blueSlot) {
                        if(User.sw1 == 1) {
                            if (countGetCoin > 0 && numberBlueCoin == 4 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberBlueCoin--;
                                User.numberBlueCoin1++;
                                User.numberUserGetBlueCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberBlueCoin == 3 && User.numberUserGetBlueCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberBlueCoin--;
                                User.numberBlueCoin1++;
                                User.numberUserGetBlueCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberBlueCoin <= 4 && numberBlueCoin > 0 && User.numberUserGetBlueCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberBlueCoin--;
                                User.numberBlueCoin1++;
                                User.numberUserGetBlueCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                        else if(User.sw2 == 1) {
                            if (countGetCoin > 0 && numberBlueCoin == 4 && User.numberUserGetBlueCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberBlueCoin--;
                                User.numberBlueCoin2++;
                                User.numberUserGetBlueCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberBlueCoin == 3 && User.numberUserGetBlueCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetWhiteCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberBlueCoin--;
                                User.numberBlueCoin2++;
                                User.numberUserGetBlueCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberBlueCoin <= 4 && numberBlueCoin > 0 && User.numberUserGetBlueCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberBlueCoin--;
                                User.numberBlueCoin2++;
                                User.numberUserGetBlueCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                    }


                    else if (whiteSlot) {
                        if(User.sw1 == 1) {
                            if (countGetCoin > 0 && numberWhiteCoin == 4 && User.numberUserGetWhiteCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberWhiteCoin--;
                                User.numberWhiteCoin1++;
                                User.numberUserGetWhiteCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberWhiteCoin == 3 && User.numberUserGetWhiteCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberWhiteCoin--;
                                User.numberWhiteCoin1++;
                                User.numberUserGetWhiteCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberWhiteCoin <= 4 && numberWhiteCoin > 0 && User.numberUserGetWhiteCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberWhiteCoin--;
                                User.numberWhiteCoin1++;
                                User.numberUserGetWhiteCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                        else if(User.sw2 == 1) {
                            if (countGetCoin > 0 && numberWhiteCoin == 4 && User.numberUserGetWhiteCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberWhiteCoin--;
                                User.numberWhiteCoin2++;
                                User.numberUserGetWhiteCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberWhiteCoin == 3 && User.numberUserGetWhiteCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetBlackCoin == 0) {
                                numberWhiteCoin--;
                                User.numberWhiteCoin2++;
                                User.numberUserGetWhiteCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberWhiteCoin <= 4 && numberWhiteCoin > 0 && User.numberUserGetWhiteCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetBlackCoin == 0 || User.numberUserGetBlackCoin == 1 || User.numberUserGetBlackCoin == 2)) {
                                numberWhiteCoin--;
                                User.numberWhiteCoin2++;
                                User.numberUserGetWhiteCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                    }


                    else if (blackSlot) {
                        if(User.sw1 == 1) {
                            if (countGetCoin > 0 && numberBlackCoin == 4 && User.numberUserGetBlackCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetWhiteCoin == 0) {
                                numberBlackCoin--;
                                User.numberBlackCoin1++;
                                User.numberUserGetBlackCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberBlackCoin == 3 && User.numberUserGetBlackCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetWhiteCoin == 0) {
                                numberBlackCoin--;
                                User.numberBlackCoin1++;
                                User.numberUserGetBlackCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberBlackCoin <= 4 && numberBlackCoin > 0 && User.numberUserGetBlackCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2)) {
                                numberBlackCoin--;
                                User.numberBlackCoin1++;
                                User.numberUserGetBlackCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                        else if(User.sw2 == 1) {
                            if (countGetCoin > 0 && numberBlackCoin == 4 && User.numberUserGetBlackCoin == 0
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetWhiteCoin == 0) {
                                numberBlackCoin--;
                                User.numberBlackCoin2++;
                                User.numberUserGetBlackCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if (countGetCoin > 0 && numberBlackCoin == 3 && User.numberUserGetBlackCoin == 1
                                    && User.numberUserGetRedCoin == 0 && User.numberUserGetGreenCoin == 0
                                    && User.numberUserGetBlueCoin == 0 && User.numberUserGetWhiteCoin == 0) {
                                numberBlackCoin--;
                                User.numberBlackCoin2++;
                                User.numberUserGetBlackCoin++;
                                countGetCoin = 0;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                            else if(countGetCoin > 0 && numberBlackCoin <= 4 && numberBlackCoin > 0 && User.numberUserGetBlackCoin == 0 &&
                                    (User.numberUserGetRedCoin == 0 || User.numberUserGetRedCoin == 1 || User.numberUserGetRedCoin == 2 ||
                                            User.numberUserGetGreenCoin == 0 || User.numberUserGetGreenCoin == 1 || User.numberUserGetGreenCoin == 2 ||
                                            User.numberUserGetBlueCoin == 0 || User.numberUserGetBlueCoin == 1 || User.numberUserGetBlueCoin == 2 ||
                                            User.numberUserGetWhiteCoin == 0 || User.numberUserGetWhiteCoin == 1 || User.numberUserGetWhiteCoin == 2)) {
                                numberBlackCoin--;
                                User.numberBlackCoin2++;
                                User.numberUserGetBlackCoin++;
                                countGetCoin--;


                                frame.dispose();
                                JFrame storeAgain = new Store();
                                storeAgain.setVisible(true);
                            }
                        }
                    }

            }
        });


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        Font font1 = new Font("Arial", Font.PLAIN, 18);
        g.setFont(font1);

        if (n % 2 != 0) {
            g.drawImage(icon.getImage(), 0, 0, 80, 80, this);
        }

            switch (n) {


                case 2:
                    String NumberRedCoin = String.valueOf(numberRedCoin);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(NumberRedCoin, 15, 25);
                    break;


                case 4:
                    String NumberGreenCoin = String.valueOf(numberGreenCoin);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(NumberGreenCoin, 15, 25);
                    break;


                case 6:
                    String NumberBlueCoin = String.valueOf(numberBlueCoin);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(NumberBlueCoin, 15, 25);
                    break;


                case 8:
                    String NumberWhiteCoin = String.valueOf(numberWhiteCoin);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(NumberWhiteCoin, 15, 25);
                    break;


                case 10:
                    String NumberBlackCoin = String.valueOf(numberBlackCoin);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(NumberBlackCoin, 15, 25);
                    break;

                case 12:
                    String NumberGoldCoin = String.valueOf(numberGoldCoin);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(NumberGoldCoin, 15, 25);
                    break;






                case 14:
                    String numberRedCoin1 = String.valueOf(User.numberRedCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberRedCoin1, 15, 25);
                    break;

                case 16:
                    String numberRedCoin2 = String.valueOf(User.numberRedCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberRedCoin2, 15, 25);
                    break;


                case 18:
                    String numberGreenCoin1 = String.valueOf(User.numberGreenCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberGreenCoin1, 15, 25);
                    break;

                case 20:
                    String numberGreenCoin2 = String.valueOf(User.numberGreenCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberGreenCoin2, 15, 25);
                    break;


                case 22:
                    String numberBlueCoin1 = String.valueOf(User.numberBlueCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberBlueCoin1, 15, 25);
                    break;

                case 24:
                    String numberBlueCoin2 = String.valueOf(User.numberBlueCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberBlueCoin2, 15, 25);
                    break;


                case 26:
                    String numberWhiteCoin1 = String.valueOf(User.numberWhiteCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberWhiteCoin1, 15, 25);
                    break;

                case 28:
                    String numberWhiteCoin2 = String.valueOf(User.numberWhiteCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberWhiteCoin2, 15, 25);
                    break;


                case 30:
                    String numberBlackCoin1 = String.valueOf(User.numberBlackCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberBlackCoin1, 15, 25);
                    break;

                case 32:
                    String numberBlackCoin2 = String.valueOf(User.numberBlackCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberBlackCoin2, 15, 25);
                    break;


                case 34:
                    String numberGoldCoin1 = String.valueOf(User.numberGoldCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberGoldCoin1, 15, 25);
                    break;

                case 36:
                    String numberGoldCoin2 = String.valueOf(User.numberGoldCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 40, 40);
                    g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
                    g.drawString(numberGoldCoin2, 15, 25);
                    break;




                case 38:
                    String numberSpecialRedCoin1 = String.valueOf(User.numberSpecialRedCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialRedCoin1, 10, 21);
                    break;

                case 40:
                    String numberSpecialRedCoin2 = String.valueOf(User.numberSpecialRedCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialRedCoin2, 10, 21);
                    break;


                case 42:
                    String numberSpecialGreenCoin1 = String.valueOf(User.numberSpecialGreenCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialGreenCoin1, 10, 21);
                    break;

                case 44:
                    String numberSpecialGreenCoin2 = String.valueOf(User.numberSpecialGreenCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialGreenCoin2, 10, 21);
                    break;


                case 46:
                    String numberSpecialBlueCoin1 = String.valueOf(User.numberSpecialBlueCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialBlueCoin1, 10, 21);
                    break;

                case 48:
                    String numberSpecialBlueCoin2 = String.valueOf(User.numberSpecialBlueCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialBlueCoin2, 10, 21);
                    break;


                case 50:
                    String numberSpecialWhiteCoin1 = String.valueOf(User.numberSpecialWhiteCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialWhiteCoin1, 10, 21);
                    break;

                case 52:
                    String numberSpecialWhiteCoin2 = String.valueOf(User.numberSpecialWhiteCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialWhiteCoin2, 10, 21);
                    break;


                case 54:
                    String numberSpecialBlackCoin1 = String.valueOf(User.numberSpecialBlackCoin1);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialBlackCoin1, 10, 21);
                    break;

                case 56:
                    String numberSpecialBlackCoin2 = String.valueOf(User.numberSpecialBlackCoin2);
                    g.setColor(Color.black);
                    g.fillOval(0, 0, 30, 30);
                    g.drawImage(icon.getImage(), 0, 0, 30, 30, this);
                    g.drawString(numberSpecialBlackCoin2, 10, 21);
                    break;
            }

    }
}