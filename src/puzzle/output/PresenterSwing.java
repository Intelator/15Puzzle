package puzzle.output;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

/**
 * Created by User on 27.10.2015.
 */
public class PresenterSwing extends Presenter {
    JFrame frame = null;

    public PresenterSwing() {
        super();
        frame = new JFrame("15Puzzle");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(480, 560);
        frame.setVisible(true);
        log.info("Frame created.");
    }

    @Override
    public void clearField() {

    }

    @Override
    public void drawField(List<Integer> fields) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEtchedBorder());
        frame.getContentPane().add(panel);
        //TODO continue after drawTile
    }

    private void drawTile(int ver, int hor, int value) {
        //TODO implement
    }
}
