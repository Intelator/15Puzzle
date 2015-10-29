package puzzle.output;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by User on 29.10.2015.
 */
public class Painter extends JComponent {
    private List fields = null;

    Painter(List fields) {
        this.fields = fields;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawTile(0, 0, 40, 40, 5, g2d);
    }

    public void drawTile(int x, int y, int hor, int ver, int value, Graphics2D g2d) {
        g2d.setColor(new Color(128, 0, 0));
        g2d.drawRoundRect(x, y, hor, ver, (int) hor / 4, (int) ver / 4);
    }
}