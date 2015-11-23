package puzzle.core;

import org.main.MovementDirections;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by User on 21.10.2015.
 */
public abstract class FieldProcessor {
    static Logger log = Logger.getLogger(FieldProcessor.class.getName());
    List<Integer> fields = null;
    int quantity = 0;

    FieldProcessor() {
        try {
            FileHandler fh = new FileHandler("%t/history.log");
            log.addHandler(fh);

        } catch (SecurityException e) {
            log.log(Level.SEVERE,
                    "Cannot create file because of security policy.",
                    e);
        } catch (IOException e) {
            log.log(Level.SEVERE,
                    "Cannot create file because of IOException.",
                    e);
        }
    }

    public abstract void createField();
    public abstract boolean hasSolution();
    public abstract boolean isFinished();
    public abstract boolean isMovePossible(MovementDirections direct);
    public abstract void moveTile(MovementDirections direct);
    public abstract List<Integer> getValues();
    public abstract void setQuantity(int quantity);
}
