import javax.swing.*;

public class CardPanelTwo extends JPanel {

    public CardPanelTwo(int n) {
        if (n == 1) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/cannon.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png","2"));
        }
        else if (n == 2) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/waterPark.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png","2"));
        }
        else if (n == 3) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/swinging.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png","3"));
        }
        else if (n == 4) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/funfar.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-4.png","3"));
        }
        else if (n == 5) {
            add(new CardOne("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/train.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-4.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-4.png","4"));
        }
    }
}
