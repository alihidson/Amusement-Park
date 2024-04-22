import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
//import javax.sound.sampled.*;

public class FirstPage extends JPanel {

    private NamePage namePage; // first value is null

    public FirstPage() {
        setLayout(null);

        JPanel rectangle1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth("Start")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString("Start", x, y);
            }
        };
        rectangle1.setBounds(600, 150, 100, 50);



        JPanel rectangle2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.green);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.BLUE);
                Font font = new Font("Arial", Font.PLAIN, 12);
                g.setFont(font);
                FontMetrics metrics = g.getFontMetrics(font);
                int x = (getWidth() - metrics.stringWidth("ID")) / 2;
                int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
                g.drawString("ID", x, y);
            }
        };
        rectangle2.setBounds(600, 205, 100, 50);

//        playMusic("/Users/ali/Main/Documents/Source/Amusement-Park/src/Music/Start-Game.mp3");

        rectangle1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (namePage == null) {
                    namePage = new NamePage(FirstPage.this);
                }
                namePage.setVisible(true);
            }
        });

        rectangle2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "My ID is 'alihidson' on all platforms","ID", JOptionPane.QUESTION_MESSAGE);
            }
        });

        add(rectangle1);
        add(rectangle2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image backgroundImage = new ImageIcon("/Users/ali/Main/Documents/Source/Amusement-Park/src/image/Amusement-Park.jpg").getImage();
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Adding text to the page
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File("/Users/ali/Main/Documents/Source/Amusement-Park/src/Font/Sectar.otf")).deriveFont(Font.BOLD, 44);
            g.setFont(font);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        g.setColor(Color.red);
        String text = "Amusement Park";
        int x = 460; // X coordinate
        int y = 100; // Y coordinate
        g.drawString(text, x, y);
    }

    public void closePages() {
        if (namePage != null) {
            namePage.dispose(); // Close NamePage
            namePage = null; // Reset reference
        }
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose(); // Close FirstPage
    }
//    public void playMusic(String filePath) {
//        try {
//            File audioFile = new File(filePath);
//            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioStream);
//            clip.start();
//        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
//            e.printStackTrace();
//        }
//    }
}
