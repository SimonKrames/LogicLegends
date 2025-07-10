package controller;

import model.Answer;
import model.Points;
import model.Question;
import model.QuestionPool;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameSession {
    private static final int MAX_QUESTIONS = 20;

    private final QuestionPool questionPool;
    private final Points points;
    private int questionCount = 0;
    private Question currentQuestion;
    private final Set<Integer> selectedIndices = new HashSet<>();

    public GameSession(QuestionPool questionPool, Points points) {
        this.questionPool = questionPool;
        this.points = points;
        loadNextQuestion();
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public Points getPoints() {
        return points;
    }

    public int getScore() {
        return points.getScore();
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public boolean isGameOver() {
        return questionCount >= MAX_QUESTIONS;
    }

    public void loadNextQuestion() {
        currentQuestion = questionPool.getRandomQuestion();
        selectedIndices.clear();
        if (questionCount < MAX_QUESTIONS) {
            questionCount++;
        }
    }

    public void reset() {
        points.reset();
        questionCount = 0;
        loadNextQuestion();
    }

    public void selectAnswer(int index) {
        if (selectedIndices.contains(index)) {
            selectedIndices.remove(index); // Toggle off
        } else {
            selectedIndices.add(index); // Toggle on
        }
    }

    public boolean checkAnswers() {
        List<Answer> answers = currentQuestion.getAnswers();
        boolean allCorrect = true;

        for (int i = 0; i < answers.size(); i++) {
            boolean shouldBeSelected = answers.get(i).isCorrect();
            boolean isSelected = selectedIndices.contains(i);

            if (shouldBeSelected != isSelected) {
                allCorrect = false;
                break;
            }
        }

        if (allCorrect) {
            points.addPoints(50);
        }

        return allCorrect;
    }

    public Set<Integer> getSelectedIndices() {
        return new HashSet<>(selectedIndices);
    }
}
