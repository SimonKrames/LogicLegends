package utils;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

public class ResourceLoader {

    public static ImageIcon loadIcon(String fileName) {
        var url = ResourceLoader.class.getClassLoader().getResource("icons/" + fileName);
        if (url == null) {
            System.err.println("Icon not found: icons/" + fileName);
            return new ImageIcon();
        }
        return new ImageIcon(url);
    }

    public static Font loadFont(String fileName, float size) {
        try {
            InputStream is = ResourceLoader.class.getClassLoader().getResourceAsStream("fonts/" + fileName);
            if (is == null) {
                System.err.println("Font not found: fonts/" + fileName);
                return new Font("SansSerif", Font.PLAIN, (int) size);
            }
            return Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(size);
        } catch (Exception e) {
            System.err.println("Error loading font: " + e.getMessage());
            return new Font("SansSerif", Font.PLAIN, (int) size);

        }
    }
}
