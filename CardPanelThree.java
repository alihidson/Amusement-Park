import javax.swing.*;

public class CardPanelThree extends JPanel {

    public int numberCard31;
    public int numberCard32;
    public int numberCard33;
    public int numberCard34;
    public int numberCard35;

    public CardPanelThree(int n) {

        switch (n) {

            case 1:
            Card card31 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/big-drop.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-4.png",
                    null, "3");

            numberCard31 = Card.clickCount31;
            add(card31);
            break;


            case 2:
            Card card32 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/car.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png",
                    null , "3");

            numberCard32 = Card.clickCount32;
            add(card32);
            break;


            case 3:
            Card card33 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/roller-coaster.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png","4");

            numberCard33 = Card.clickCount33;
            add(card33);
            break;


            case 4:
            Card card34 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/big-swingset.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-2.png", "4");

            numberCard34 = Card.clickCount34;
            add(card34);
            break;


            case 5:
            Card card35 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/measure-strength.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png","4");

            numberCard35 = Card.clickCount35;
            add(card35);
            break;
        }
    }
}
