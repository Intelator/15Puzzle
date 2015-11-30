package puzzle.input;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by AGrechishnikov on 30-Nov-15.
 */
public class InputManagerSwingImpl extends InputManager {
    public String getInput() {
        String inputCase = null;

        /*JTextField textField = new JTextField(20);
        textField.addKeyListener(new KeyListener() {
            String input = null;

            String getInput() {
                return input;
            }

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

        inputCase = getInput();*/

        return inputCase;
    }
}
