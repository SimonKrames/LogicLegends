package view;

import model.HighscoreManager;
import utils.ResourceLoader;
import viewmodel.GameViewModel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ScorePanel extends JPanel {

    private final JLabel scoreLabel;
    private final JLabel highscoreLabel;
    private final GameViewModel viewModel;
    private final HighscoreManager highscoreManager;

    public ScorePanel(GameViewModel viewModel, HighscoreManager highscoreManager) {
        this.viewModel = viewModel;
        this.highscoreManager = highscoreManager;
        setLayout(null);
        setOpaque(false);
        setBounds(30, 400, 200, 50);

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setBounds(10, 10, 180, 50);

        //FIXME Only score----------------------------------------------
        //setBackground(new Color(255, 200, 200));
        //setOpaque(true);

        scoreLabel.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 24f));

        //scoreLabel.setBorder(new LineBorder(Color.RED));
        add(scoreLabel);

        highscoreLabel = new JLabel("Highscore: 0");
        highscoreLabel.setBounds(290, 0, 200, 50);
        //highscoreLabel.setBorder(new LineBorder(Color.RED));
        add(highscoreLabel);
    }

    public void updateScoreDisplay() {
        scoreLabel.setText("Score: " + viewModel.getScore());
        int topScore = highscoreManager.getHighscores().isEmpty()
                ? 0
                : highscoreManager.getHighscores().get(0).score;
        highscoreLabel.setText("Highscore: " + topScore);
    }
}
