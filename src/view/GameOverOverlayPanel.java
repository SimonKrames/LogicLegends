package view;

import utils.ResourceLoader;
import model.HighscoreManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.function.BiConsumer;

public class GameOverOverlayPanel extends JPanel {

    private final int score;
    private final BiConsumer<String, Integer> onHighscoreEntered;

    public GameOverOverlayPanel(int score, HighscoreManager highscoreManager, BiConsumer<String, Integer> onHighscoreEntered) {
        this.score = score;
        this.onHighscoreEntered = onHighscoreEntered;
        setOpaque(false);
        setLayout(null);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 300, 200, 100);
        add(nameField);

        JTextArea highscoreArea = new JTextArea();
        highscoreArea.setEditable(false);
        highscoreArea.setOpaque(false);
        highscoreArea.setForeground(Color.BLACK);
        highscoreArea.setFont(new Font("SansSerif", Font.PLAIN, 18));
        StringBuilder sb = new StringBuilder("Highscores:\n");
        for (HighscoreManager.HighscoreEntry entry : highscoreManager.getHighscores()) {
            sb.append(entry.name).append(" - ").append(entry.score).append("\n");
        }
        highscoreArea.setText(sb.toString());
        highscoreArea.setBounds(200, 350, 200, 100);

        add(highscoreArea);

        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String name = nameField.getText().trim().toUpperCase();
                    if (!name.isEmpty() && name.length() <= 3) {
                        onHighscoreEntered.accept(name, score);
                    }
                }
            }
        });

        nameField.requestFocusInWindow();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image img = ResourceLoader.loadIcon("gameover.png").getImage();
        int imgWidth = 400;
        int imgHeight = 400;
        int xImg = (getWidth() - imgWidth) / 2;
        int yImg = 50;
        g.drawImage(img, xImg, yImg, imgWidth, imgHeight, this);

        g.setColor(Color.RED);  // Neue Farbe
        g.setFont(new Font("SansSerif", Font.BOLD, 32));
        g.drawString("Game Over!", 100, yImg + imgHeight + 40);

        g.setFont(new Font("SansSerif", Font.BOLD, 24));
        g.drawString("Score: " + score, 100, yImg + imgHeight + 80);
    }


}
