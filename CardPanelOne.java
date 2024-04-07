import javax.swing.*;

public class CardPanelOne extends JPanel {

    public CardPanelOne(int n) {
        if (n == 1) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/swingset.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-2.png",
                            "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png","0"));
        }
        else if (n == 2) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/horse.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png","0"));
        }
        else if (n == 3) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/zoo.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-3.png","1"));
        }
        else if (n == 4) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/circus.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png","1"));
        }
        else if (n == 5) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/firebreather.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png","1"));
        }
    }
}
