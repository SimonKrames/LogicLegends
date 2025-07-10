package view;

import utils.ResourceLoader;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class HighscoreInputPanel extends JPanel {
    public HighscoreInputPanel(Consumer<String> onNameEntered) {
        setLayout(null);
        setOpaque(false);

        JLabel prompt = new JLabel(" ");
        prompt.setBounds(50, 20, 400, 30); // etwas breiter für lange Textanzeige
        prompt.setForeground(Color.BLUE);
        prompt.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 20f));
        add(prompt);

        JTextField nameField = new JTextField();
        nameField.setBounds(50, 60, 200, 40); // breiter + höher für mehr Eingabegefühl
        nameField.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 24f)); // etwas größere Schrift
        add(nameField);

        JButton okButton = new JButton("OK");
        okButton.setBounds(270, 60, 80, 40); // Höhe angepasst
        okButton.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 18f));
        okButton.addActionListener(e -> {
            String name = nameField.getText().trim().toUpperCase();
            if (!name.isEmpty() && name.length() <= 3) {
                onNameEntered.accept(name);
            }
        });
        add(okButton);
    }
}
