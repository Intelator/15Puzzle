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
    private int frameWidth = 400;
    private int frameHeight = 400;

    public PresenterSwing() {
        super();
    }

    public void createField (List fields) {
        painter = new Painter(fields, frameWidth, frameHeight);
        painter.setBounds(0, 0, frameWidth, frameHeight);
        frame = new JFrame("15Puzzle");
//        frame.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
        frame.setSize(frameWidth, frameHeight);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painter);
        //frame.pack();
        frame.setVisible(true);
        drawField(fields);
        log.info("Frame created.");
    }

    @Override
    public void clearField() {

    }

    @Override
    public void drawField(List<Integer> fields) {
        painter.repaint();
    }

}
