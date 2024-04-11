import javax.swing.*;
import java.awt.*;

public class CardPanelTwo extends JPanel {

    public int numberCard21;
    public int numberCard22;
    public int numberCard23;
    public int numberCard24;
    public int numberCard25;

    public CardPanelTwo(int n) {

        switch (n) {

             case 1:
             Card card21 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/cannon.png",
                "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin.png",
                "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-3.png",
                "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                null, "2");

            numberCard21 = Card.clickCount21;
            add(card21);
            break;


            case 2:
            Card card22 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/waterPark.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png",
                    null, "2");

            numberCard22 = Card.clickCount22;
            add(card22);
            break;


            case 3:
            Card card23 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/swinging.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png",
                    null, "3");

            numberCard23 = Card.clickCount23;
            add(card23);
            break;


            case 4:
            Card card24 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/funfar.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-2.png", "3");

            numberCard24 = Card.clickCount24;
            add(card24);
            break;


            case 5:
            Card card25 = new Card("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/train.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-4.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-4.png",
                    null, "4");

            numberCard25 = Card.clickCount25;
            add(card25);
            break;
        }
    }
}
