package model;

public class Points {
    private int score;

    public Points() {
        this.score = 0;
    }

    public void addPoints(int value) {
        score = Math.min(score + value, 999);
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        this.score = 0;
    }
}
