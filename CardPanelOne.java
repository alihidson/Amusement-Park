import javax.swing.*;

public class CardPanelOne extends JPanel {

    public int numberCard11;
    public int numberCard12;
    public int numberCard13;
    public int numberCard14;
    public int numberCard15;


    public CardPanelOne(int n) {

        switch (n) {

                case 1:
                Card card11 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/little-swingset.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-2.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png", null, "0");

                numberCard11 = Card.clickCount11;
                add(card11);
                break;


                case 2:
                Card card12 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/horse.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-2.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png", null, "0");

                numberCard12 = Card.clickCount12;
                add(card12);
                break;


                case 3:
                Card card13 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/zoo.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-2.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-2.png", null, "1");

                numberCard13 = Card.clickCount13;
                add(card13);
                break;


                case 4:
                Card card14 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/circus.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-2.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png", null, "1");

                numberCard14 = Card.clickCount14;
                add(card14);
                break;


                case 5:
                Card card15 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/firebreather.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-3.png",
                        "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                        null, "1");

                numberCard15 = Card.clickCount15;
                add(card15);
                break;
        }
    }
}
