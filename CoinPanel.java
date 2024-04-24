import javax.swing.*;

public class CoinPanel extends JPanel {

    public CoinPanel(int n) {

        switch (n) {
            case 1:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-red.png", n));
                break;

            case 2, 14, 16:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png", n));
                break;

            case 3:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-green.png", n));
                break;

            case 4, 18, 20:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png", n));
                break;

            case 5:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-blue.png", n));
                break;

            case 6, 22, 24:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png", n));
                break;

            case 7:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-white.png", n));
                break;

            case 8, 26, 28:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png", n));
                break;

            case 9:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/slot-machine-black.png", n));
                break;

            case 10, 30, 32:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png", n));
                break;

            case 12, 34, 36:
                add(new Coin("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/gold-coin.png", n));
                break;

        }
    }
}