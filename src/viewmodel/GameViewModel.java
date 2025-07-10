package viewmodel;

import controller.GameSession;
import model.Answer;
import model.Question;

import java.util.List;
import java.util.Set;

public class GameViewModel {

    private final GameSession session;

    public GameViewModel(GameSession session) {
        this.session = session;
    }

    public String getQuestionText() {
        Question q = session.getCurrentQuestion();
        return q != null ? q.getText() : "";
    }

    public List<Answer> getAnswers() {
        Question q = session.getCurrentQuestion();
        return q != null ? q.getAnswers() : List.of();
    }

    public void selectAnswer(int index) {
        session.selectAnswer(index);
    }

    public boolean checkAndScore() {
        return session.checkAnswers();
    }

    public int getScore() {
        return session.getScore();
    }

    public void loadNextQuestion() {
        session.loadNextQuestion();
    }

    public void resetGame() {
        session.reset();
    }

    public boolean isGameOver() {
        return session.isGameOver();
    }

    public Set<Integer> getSelectedIndices() {
        return session.getSelectedIndices();
    }
}
