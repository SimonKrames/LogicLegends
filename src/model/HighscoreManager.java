package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighscoreManager {
    private final List<HighscoreEntry> highscores = new ArrayList<>();

    public HighscoreManager() {
        loadHighscores();
    }

    public boolean isHighscore(int score) {
        return highscores.size() < 10 || score > highscores.get(highscores.size() - 1).score;
    }

    public void addHighscore(String name, int score) {
        highscores.add(new HighscoreEntry(name, score));
        highscores.sort((a, b) -> Integer.compare(b.score, a.score));
        while (highscores.size() >10) {
            highscores.remove(10);
        }
        saveHighscores();
    }

    public List<HighscoreEntry> getHighscores() {
        return new ArrayList<>(highscores);
    }

    private void saveHighscores() {
        try (FileWriter writer = new FileWriter("highscores.txt")) {
            for (HighscoreEntry entry : highscores) {
                writer.write(entry.name + ";" + entry.score + "\n");
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Speichern der Highscores: " + e.getMessage());
        }
    }

    private void loadHighscores() {
        highscores.clear();
        try (Scanner scanner = new Scanner(new File("highscores.txt"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(";");
                if (parts.length == 2) {
                    String name = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    highscores.add(new HighscoreEntry(name, score));
                }
            }
            highscores.sort((a, b) -> Integer.compare(b.score, a.score));
            while (highscores.size() > 10) {
                highscores.remove(10);
            }
        } catch (Exception e) {
            System.err.println("Fehler beim Laden der Highscores: " + e.getMessage());
        }
    }

    public static class HighscoreEntry {
        public final String name;
        public final int score;

        public HighscoreEntry(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
