package puzzle.output;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

/**
 * Created by User on 27.10.2015.
 */
public class PresenterSwing extends Presenter {
    JFrame frame = null;
    Painter painter = null;
    Graphics g = null;

    public PresenterSwing(List fields) {
        super();
        painter = new Painter(fields);
        frame = new JFrame("15Puzzle");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        g = frame.getGraphics();
        frame.pack();
        frame.setVisible(true);
        log.info("Frame created.");
    }

    @Override
    public void clearField() {

    }

    @Override
    public void drawField(List<Integer> fields) {
        painter.paintComponent(g);
    }

}
