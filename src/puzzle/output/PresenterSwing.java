package puzzle.output;

import javax.swing.*;
import java.util.List;

/**
 * Created by User on 27.10.2015.
 */
public class PresenterSwing extends Presenter {
    public PresenterSwing() {
        super();
        JFrame frame = new JFrame("15Puzzle");
        frame.setSize(640, 480);
        frame.setVisible(true);
        log.info("Frame created.");
    }

    @Override
    public void clearField() {

    }

    @Override
    public void drawField(List<Integer> fields) {

    }
}
