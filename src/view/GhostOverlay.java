package view;

import javax.swing.*;

public class GhostOverlay extends JLabel {
    @Override
    public boolean contains(int x, int y) {
        return false;
    }
}
