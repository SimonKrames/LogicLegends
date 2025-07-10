package view;

import controller.GameSession;
import model.Answer;
import model.HighscoreManager;
import view.ButtonFactory;
import utils.ResourceLoader;
import viewmodel.GameViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.function.BiConsumer;

public class ControlButtonPanel extends JPanel {

    private final JButton resetButton;
    private final JButton logButton;
    private final JButton closeButton;
    private final JButton minimizeButton;
    private final JButton moveButton;

    public ControlButtonPanel(GameViewModel viewModel,
                              GameSession session,
                              HighscoreManager highscoreManager,
                              Runnable onGameReset,
                              Runnable onUpdateView,
                              Runnable onGameOverHandled,
                              BiConsumer<Boolean, List<Answer>> updateAnswerIcons) {

        setLayout(null);
        setOpaque(false);
        setBounds(0, 0, 600, 800);
        //Fixme-----------------------------------------------------------
        /*setBackground(new Color(100, 100, 100));
       setOpaque(true);
*/
        resetButton = ButtonFactory.createButton("RESET", "btn-reset.png", "pressed-btn-reset.png", 45, 40, 100, 50);
        resetButton.addActionListener(e -> {
            viewModel.resetGame();
            onGameReset.run();
        });
        add(resetButton);

        logButton = ButtonFactory.createButton("LOG", "log-btn.png", "pressed-log-btn.png", 225, 640, 150, 100);
        logButton.addActionListener(e -> {
            if (viewModel.isGameOver()) return;
            boolean correct = viewModel.checkAndScore();
            updateAnswerIcons.accept(correct, viewModel.getAnswers());

            new Timer(1500, event -> {
                if (viewModel.isGameOver()) {
                    onGameOverHandled.run();
                } else {
                    viewModel.loadNextQuestion();
                    onUpdateView.run();
                }
                ((Timer) event.getSource()).stop();
            }).start();
        });
        add(logButton);

        closeButton = ButtonFactory.createButton("CLOSE", "btn-close.png", "pressed-btn-close.png", 530, 40, 40, 40);
        closeButton.addActionListener(e -> System.exit(0));
        add(closeButton);

        minimizeButton = ButtonFactory.createButton("MINIMIZE", "btn-minimize.png", "pressed-btn-minimize.png", 480, 40, 40, 40);
        minimizeButton.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.setState(Frame.ICONIFIED);
        });
        add(minimizeButton);

        moveButton = ButtonFactory.createButton("MOVE", "btn-move.png", "pressed-btn-move.png", 430, 40, 40, 40);
        MouseAdapter moveAdapter = new MouseAdapter() {
            private Point initialClick;

            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = SwingUtilities.convertPoint(moveButton, e.getPoint(), ControlButtonPanel.this);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(ControlButtonPanel.this);
                if (frame != null && initialClick != null) {
                    Point locationOnScreen = e.getLocationOnScreen();
                    int X = locationOnScreen.x - initialClick.x;
                    int Y = locationOnScreen.y - initialClick.y;
                    frame.setLocation(X, Y);
                }
            }
        };
        moveButton.addMouseListener(moveAdapter);
        moveButton.addMouseMotionListener(moveAdapter);
        add(moveButton);
    }
}
