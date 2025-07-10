package view;

import model.Answer;
import utils.ResourceLoader;
import viewmodel.GameViewModel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.List;

public class QuestionPanel extends JPanel {


    private final GameViewModel viewModel;
    private final JLabel questionLabel;
    private final JLabel[] answerLabels;
    private final GhostOverlay hoverOverlay = new GhostOverlay();
    private final JLabel overlayText = new JLabel("", SwingConstants.CENTER);
    private String truncate(String text, int maxLength) {
        return text.length() > maxLength ? text.substring(0, maxLength - 3) + "..." : text;
    }


    private boolean gameOver = false;


    public QuestionPanel(GameViewModel viewModel) {
        this.viewModel = viewModel;
        setLayout(null);
        setOpaque(false);

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setBounds(40, 40, 530, 300);
        questionLabel.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 20f));
        //questionLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        add(questionLabel);
//label.setBorder
        answerLabels = new JLabel[4];
        for (int i = 0; i < 4; i++) {
            JLabel lbl = new JLabel();
            lbl.setBounds(78, 370 + i * 60, 480, 60);
            lbl.setHorizontalTextPosition(SwingConstants.CENTER);
            lbl.setVerticalTextPosition(SwingConstants.CENTER);
            lbl.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // top, left, bottom, right

            lbl.setForeground(Color.BLACK);
            final int index = i;

            lbl.addMouseListener(new java.awt.event.MouseAdapter() {

                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    if (gameOver) return;

                    viewModel.selectAnswer(index);
                    if (viewModel.getSelectedIndices().contains(index)) {
                        lbl.setIcon(ResourceLoader.loadIcon((char) ('A' + index) + "-selected-label.png"));
                    } else {
                        lbl.setIcon(ResourceLoader.loadIcon((char) ('A' + index) + "-unused-label.png"));
                    }


                    hoverOverlay.setVisible(false);
                    overlayText.setText("");
                }

                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    boolean selected = viewModel.getSelectedIndices().contains(index);
                    String state = selected ? "selected" : "unused";
                    char letter = (char) ('A' + index);
                    hoverOverlay.setIcon(ResourceLoader.loadIcon(letter + "-wide-" + state + "-label.png"));
                    hoverOverlay.setVisible(true);
                    overlayText.setText("<html><div style='width:350px; text-align:center;'>"
                            + viewModel.getAnswers().get(index).getText().replace("\n", "<br>")
                            + "</div></html>");


                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    hoverOverlay.setVisible(false);
                    overlayText.setText("");
                }
            });



            answerLabels[i] = lbl;
            add(lbl); // Label hinzufügen
        }


        hoverOverlay.setBounds(90, 340, 600, 300);
        hoverOverlay.setOpaque(false);
        hoverOverlay.setVisible(false);
        add(hoverOverlay);
        setComponentZOrder(hoverOverlay, 0);
        overlayText.setBounds(0, 0, 500, 250);
        overlayText.setOpaque(false);
        overlayText.setForeground(Color.BLACK);
        overlayText.setHorizontalAlignment(SwingConstants.CENTER);
        overlayText.setVerticalAlignment(SwingConstants.CENTER);
        overlayText.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 16f));
        hoverOverlay.setLayout(null);
        hoverOverlay.add(overlayText);


    }



    public void updateView() {
        String rawText = viewModel.getQuestionText();
        String htmlWrapped = "<html><div style='text-align:center;'>" + rawText.replace("\n", "<br>") + "</div></html>";
        questionLabel.setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 20f));
        //questionLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        questionLabel.setText(htmlWrapped);



        List<Answer> answers = viewModel.getAnswers();
        for (int i = 0; i < answerLabels.length; i++) {
            if (i < answers.size()) {
                answerLabels[i].setText(answers.get(i).getText());
                answerLabels[i].setFont(ResourceLoader.loadFont("ArchitectsDaughter.ttf", 14f));
                answerLabels[i].setIcon(ResourceLoader.loadIcon((char) ('A' + i) + "-unused-label.png"));
            } else {
                answerLabels[i].setText(answers.get(i).getText());

                answerLabels[i].setIcon(null);
            }
        }
    }

    public void updateAnswerIcons(boolean correct) {
        List<Answer> answers = viewModel.getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            String icon = answers.get(i).isCorrect()
                    ? (char) ('A' + i) + "-right-label.png"
                    : (char) ('A' + i) + "-wrong-label.png";
            answerLabels[i].setIcon(ResourceLoader.loadIcon(icon));
        }
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
