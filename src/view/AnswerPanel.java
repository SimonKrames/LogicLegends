/*package view;

import utils.ResourceLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnswerPanel extends JPanel {

    private final JLabel iconLabel;
    private final JTextArea textArea;
    private final JScrollPane scrollPane;
    private int index;
    private boolean gameOver = false;
    private Runnable onClick;

    public AnswerPanel(int index) {
        this.index = index;
        setLayout(null);
        setOpaque(false);
        setBounds(40, 370 + index * 55, 600, 50); // kann angepasst werden

        // Icon
        iconLabel = new JLabel();
        iconLabel.setBounds(0, 0, 600, 50);
        add(iconLabel);

        // Text
        textArea = new JTextArea();
        textArea.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 14f));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setOpaque(false);
        textArea.setForeground(Color.BLACK);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50, 0, 530, 50);
        scrollPane.setBorder(null);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.getVerticalScrollBar().setUnitIncrement(5);

        add(scrollPane);

        // Klick weiterreichen
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (gameOver) return;
                if (onClick != null) onClick.run();
            }
        });
    }

    public void setIcon(ImageIcon icon) {
        iconLabel.setIcon(icon);
    }

    public void setText(String text) {
        textArea.setText(text);
        textArea.setToolTipText(text);
    }

    public void setGameOver(boolean value) {
        gameOver = value;
    }

    public void setOnClick(Runnable r) {
        this.onClick = r;
    }
}
*/