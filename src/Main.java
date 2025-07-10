import controller.*;
import model.*;
import view.*;
import viewmodel.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Points points = new Points();
            QuestionPool questionPool = new QuestionPool();
            GameSession session = new GameSession(questionPool, points);
            HighscoreManager highscoreManager = new HighscoreManager();
            GameSession controller = new GameSession(questionPool, points);
            GameViewModel viewModel = new GameViewModel(controller);

            JFrame frame = new JFrame("Bit4Bit");
            frame.setUndecorated(true);
            frame.setSize(600, 800);
            frame.setShape(new RoundRectangle2D.Double(0, 0, 600, 800, 150, 150));
            frame.setLocationRelativeTo(null);

            GamePanel gamePanel = new GamePanel(viewModel, session, highscoreManager);
            frame.add(gamePanel);

            frame.setVisible(true);
        });
    }
}
