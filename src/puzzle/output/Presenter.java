package puzzle.output;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by User on 22.10.2015.
 */
public abstract class Presenter {
    static Logger log = Logger.getLogger(Presenter.class.getName());

    Presenter() {
        try {
            FileHandler fh = new FileHandler("D:\\log.txt");
            log.addHandler(fh);

        } catch (SecurityException e) {
            log.log(Level.SEVERE,
                    "Cannot create file becouse of security policy.",
                    e);
        } catch (IOException e) {
            log.log(Level.SEVERE,
                    "Cannot create file because of IOException.",
                    e);
        }
    }

    public abstract void clearField();
    public abstract void drawField(List<Integer> fields);
}
