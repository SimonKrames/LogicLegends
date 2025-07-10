package view;

import controller.GameSession;
import model.Answer;
import model.HighscoreManager;
import utils.ResourceLoader;
import viewmodel.GameViewModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel {

    private final GameViewModel viewModel;
    private final GameSession session;
    private final HighscoreManager highscoreManager;

    private final QuestionPanel questionPanel;
    private final ScorePanel scorePanel;
    private final HighscoreAreaPanel highscoreAreaPanel;
    private final ControlButtonPanel controlPanel;

    private GameOverOverlayPanel overlay;
    private boolean gameOver = false;

    public GamePanel(GameViewModel viewModel, GameSession session, HighscoreManager highscoreManager) {
        this.viewModel = viewModel;
        this.session = session;
        this.highscoreManager = highscoreManager;


        setLayout(null);
        setBackground(Color.WHITE);

        questionPanel = new QuestionPanel(viewModel);
        questionPanel.setBounds(0, 41, 600, 610);

        add(questionPanel);

        scorePanel = new ScorePanel(viewModel, highscoreManager);
        scorePanel.setBounds(40, 720, 200, 50);
        add(scorePanel);

        highscoreAreaPanel = new HighscoreAreaPanel(highscoreManager);
        highscoreAreaPanel.setBounds(0, 720, 600, 100);
        add(highscoreAreaPanel);

        controlPanel = new ControlButtonPanel(

                viewModel,
                session,
                highscoreManager,
                this::handleReset,
                this::updateView,
                this::handleGameOver,
                this::updateAnswerIconsFromLog
        );
        controlPanel.setBounds(0, 0, 600, 720);
        add(controlPanel);

        updateView();
    }

    private void handleReset() {
        gameOver = false;
        if (overlay != null) {
            Container parent = overlay.getParent();
            if (parent != null) parent.remove(overlay);
            overlay = null;
        }
        updateView();
        revalidate();
        repaint();
    }

    private void updateView() {
        questionPanel.setGameOver(gameOver);
        questionPanel.updateView();
        scorePanel.updateScoreDisplay();
        highscoreAreaPanel.updateHighscoreArea();
    }

    private void updateAnswerIconsFromLog(boolean correct, List<Answer> answers) {
        questionPanel.updateAnswerIcons(correct);
        scorePanel.updateScoreDisplay();
    }

    private void handleGameOver() {
        gameOver = true;

        if (overlay != null) {
            Container parent = overlay.getParent();
            if (parent != null) parent.remove(overlay);
            overlay = null;
        }

        overlay = new GameOverOverlayPanel(session.getScore(), highscoreManager, (name, score) -> {
            highscoreManager.addHighscore(name, score);

            if (overlay.getParent() != null) {
                overlay.getParent().remove(overlay);
            }
            overlay = null;

            viewModel.resetGame();
            gameOver = false;
            updateView();

            SwingUtilities.invokeLater(() -> {
                revalidate();
                repaint();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                if (frame != null) {
                    frame.revalidate();
                    frame.repaint();
                }
            });
        });

        overlay.setBounds(0, 0, getWidth(), getHeight());
        add(overlay);
        setComponentZOrder(overlay, 0);
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(ResourceLoader.loadIcon("background.png").getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
