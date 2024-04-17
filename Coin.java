import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Coin extends JPanel {
    private final ImageIcon icon;
    public int n;

    public int CanGetCoin1 = 3;
    public int CanGetCoin2 = 3;

    public String NRedC;
    public String NGreenC;
    public String NBlueC;
    public String NWhiteC;
    public String NBlackC;
    public String NGoldC;

    public static int numberRedCoin = 4;
    public static int numberGreenCoin = 4;
    public static int numberBlueCoin = 4;
    public static int numberWhiteCoin = 4;
    public static int numberBlackCoin = 4;

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
                        if (numberRedCoin > 0) {
                            numberRedCoin--;
                            User.numberRedCoin1++;

                            frame.dispose();
                            JFrame storeAgain = new Store();
                            storeAgain.setVisible(true);
                        }
                    }
                    else if (greenSlot) {
                        if (numberGreenCoin > 0) {
                        numberGreenCoin--;
                        frame.dispose();
                        JFrame storeAgain = new Store();
                        storeAgain.setVisible(true);
                    }
                }
                    else if (blueSlot) {
                        if (numberBlueCoin > 0) {
                            numberBlueCoin--;
                            frame.dispose();
                            JFrame storeAgain = new Store();
                            storeAgain.setVisible(true);
                        }
                    }
                    else if (whiteSlot) {
                        if (numberWhiteCoin > 0) {
                            numberWhiteCoin--;
                            frame.dispose();
                            JFrame storeAgain = new Store();
                            storeAgain.setVisible(true);
                        }
                    }
                    else if (blackSlot) {
                        if (numberBlackCoin > 0) {
                            numberBlackCoin--;
                            frame.dispose();
                            JFrame storeAgain = new Store();
                            storeAgain.setVisible(true);
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