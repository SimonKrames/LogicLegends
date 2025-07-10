package view;

import utils.ResourceLoader;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ButtonFactory {

    public static JButton createButton(String id, String iconFile, String pressedFile, int x, int y, int w, int h) {
        JButton button = new JButton(ResourceLoader.loadIcon(iconFile));
        button.setBounds(x, y, w, h);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setName(id);

        ButtonModel model = button.getModel();
        model.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (model.isPressed()) {
                    button.setIcon(ResourceLoader.loadIcon(pressedFile));
                } else {
                    button.setIcon(ResourceLoader.loadIcon(iconFile));
                }
            }
        });

        return button;
    }
}
