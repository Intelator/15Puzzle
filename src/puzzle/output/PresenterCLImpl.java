package puzzle.output;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by User on 22.10.2015.
 */
public class PresenterCLImpl implements Presenter {
    private static Logger log = Logger.getLogger(PresenterCLImpl.class.getName());

    public void clearField() {
        //TODO: Find solution
    }

    public void drawField(List<Integer> fields) {
        int lengthOfLine = (int) Math.sqrt((double) fields.size());
        int k = 0;
        for (int i = 0; i < lengthOfLine; i++) {
            String output = "";
            for (int j = 0; j < lengthOfLine; j++, k++) {
                output += (fields.get(k) + "\t");
            }
            System.out.println(output);
        }
    }

}
