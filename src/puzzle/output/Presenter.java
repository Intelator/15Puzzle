package puzzle.output;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by User on 22.10.2015.
 */
public interface Presenter {
    static Logger log = null;

    void clearField();
    void drawField(List<Integer> fields);
}
