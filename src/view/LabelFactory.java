package view;

import utils.ResourceLoader;
import javax.swing.*;

public class LabelFactory {

    public static JLabel createLabel(String id, String iconFile, int x, int y, int w, int h) {
        JLabel label = new JLabel(ResourceLoader.loadIcon(iconFile));
        label.setBounds(x, y, w, h);
        label.setName(id);
        return label;
    }
}
