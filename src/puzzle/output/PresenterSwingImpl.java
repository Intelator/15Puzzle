package puzzle.output;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

/**
 * Created by User on 27.10.2015.
 */
public class PresenterSwingImpl extends Presenter {
    JFrame frame = null;
    Painter painter = null;
    private int frameWidth = 400;
    private int frameHeight = 400;

    private String input = null;

    public String getInput () {
        return input;
    }

    public PresenterSwingImpl() {
        super();
    }

    @Override
    public void createField (List fields) {
        painter = new Painter(fields, frameWidth, frameHeight);
        painter.setBounds(0, 0, frameWidth, frameHeight);

        frame = new JFrame("15Puzzle");
        frame.setSize(frameWidth, frameHeight);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painter);
        frame.setVisible(true);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                input = e.getKeyText(e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        drawField(fields);
        log.info("Frame created.");
    }

    @Override
    public void clearField() {

    }

    @Override
    public void drawField(List fields) {
        painter.repaint();
    }

}
