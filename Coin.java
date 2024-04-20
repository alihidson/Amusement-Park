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


    public String NRedC;
    public String NGreenC;
    public String NBlueC;
    public String NWhiteC;
    public String NBlackC;
    public String NGoldC;

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



        switch (n) {

            case 2:
                NRedC = String.valueOf(numberRedCoin);
                break;

            case 4:
                NGreenC = String.valueOf(numberGreenCoin);
                break;

            case 6:
                NBlueC = String.valueOf(numberBlueCoin);
                break;

            case 8:
                NWhiteC = String.valueOf(numberWhiteCoin);
                break;

            case 10:
                NBlackC = String.valueOf(numberBlackCoin);
                break;

            case 12:
                NGoldC = String.valueOf(User.allGoldCoin);
                break;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        Font font1 = new Font("Arial", Font.PLAIN, 18);
        g.setFont(font1);

        if (n % 2 != 0) {
            g.drawImage(icon.getImage(), 0, 0, 80, 80, this);
        }
        else if(n == 2){

            g.setColor(Color.black);
            g.fillOval(0,0,40,40);
            g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
            g.drawString(NRedC, 15, 25);

        }
        else if(n == 4){

            g.setColor(Color.black);
            g.fillOval(0,0,40,40);
            g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
            g.drawString(NGreenC, 15, 25);

        }
        else if(n == 6){

            g.setColor(Color.black);
            g.fillOval(0,0,40,40);
            g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
            g.drawString(NBlueC, 15, 25);

        }
        else if(n == 8){

            g.setColor(Color.black);
            g.fillOval(0,0,40,40);
            g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
            g.drawString(NWhiteC, 15, 25);

        }
        else if(n == 10){

            g.setColor(Color.black);
            g.fillOval(0,0,40,40);
            g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
            g.drawString(NBlackC, 15, 25);

        }
        else if(n == 12){

            g.setColor(Color.black);
            g.fillOval(0,0,40,40);
            g.drawImage(icon.getImage(), 0, 0, 40, 40, this);
            g.drawString(NGoldC, 15, 25);

        }
    }
}