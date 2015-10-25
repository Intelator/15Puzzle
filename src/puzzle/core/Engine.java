package puzzle.core;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by User on 21.10.2015.
 */
public interface Engine {
    static Logger log = null;
    List<Integer> fields = null;
    int quantity = 0;

    void createField();
    //TODO public boolean hasSolvation(List<Integer> fields);
    boolean isFinished();
    void moveTile(int direction);
    List<Integer> getValues();
    void setQuantity(int quantity);
}
