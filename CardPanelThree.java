import javax.swing.*;

public class CardPanelThree extends JPanel {

    public CardPanelThree(int n) {
        if (n == 1) {
            add(new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/big-drop.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-4.png",
                    null, "3"));
        }
        else if (n == 2) {
            add(new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/car.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png",
                    null , "3"));
        }
        else if (n == 3) {
            add(new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/roller-coaster.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png","4"));
        }
        else if (n == 4) {
            add(new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/big-swingset.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-2.png", "4"));
        }
        else if (n == 5) {
            add(new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/measure-strength.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png","4"));
        }
    }
}
