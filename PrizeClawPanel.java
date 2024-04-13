import javax.swing.*;

public class PrizeClawPanel extends JPanel {

    public PrizeClawPanel(int n) {
        if (n == 1) {
            add(new PrizeClaw("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/prize-claw-1.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-2.png", "3"));
        }
        else if (n == 2) {
            add(new PrizeClaw("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/prize-claw-2.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-4.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/black-coin-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/green-coin-3.png", "3"));
        }
        else if (n == 3) {
            add(new PrizeClaw("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/prize-claw-3.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/blue-coin-4.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/white-coin-4.png",
                    "/Users/ali/Main/Documents/Source/Amusement-Park/src/image/red-coin-4.png", "4"));
        }
    }
}
