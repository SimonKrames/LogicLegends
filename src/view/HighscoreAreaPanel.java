package view;

import model.HighscoreManager;
import utils.ResourceLoader;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class HighscoreAreaPanel extends JPanel {

    private final JTextArea highscoreArea;
    private final HighscoreManager highscoreManager;

    public HighscoreAreaPanel(HighscoreManager highscoreManager) {
        this.highscoreManager = highscoreManager;
        setLayout(null);
        setOpaque(false);

        highscoreArea = new JTextArea();
        Font base = ResourceLoader.loadFont("ArchitectsDaughter.ttf", 14f);
        highscoreArea.setFont(base.deriveFont(Font.BOLD, 14f));
        highscoreArea.setForeground(new Color(60, 60, 60));
        highscoreArea.setEditable(false);
        highscoreArea.setOpaque(false);
        highscoreArea.setLineWrap(true);
        highscoreArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(highscoreArea);
        scrollPane.setBounds(400, 2, 139, 55);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUnitIncrement(3);
        // 💄 Eigene minimalistische Scrollbar<---------------------------------------------
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(100, 100, 100, 120);
                this.trackColor = new Color(0, 0, 0, 0);
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return createZeroButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return createZeroButton();
            }

            private JButton createZeroButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                button.setVisible(false);
                return button;
            }
        });

        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));

        add(scrollPane);

        updateHighscoreArea();
    }

    public void updateHighscoreArea() {
        StringBuilder sb = new StringBuilder();
        for (HighscoreManager.HighscoreEntry entry : highscoreManager.getHighscores()) {
            sb.append(entry.name).append(" - ").append(entry.score).append("\n");
        }
        highscoreArea.setText(sb.toString());
    }
}
