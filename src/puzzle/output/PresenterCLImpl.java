package puzzle.output;

import java.util.List;

/**
 * Created by User on 22.10.2015.
 */
public class PresenterCLImpl extends Presenter {
    public PresenterCLImpl() {
        super();
    }

    public String getInput() {
        return "input";
    }

    public void createField(List fields) {
        //
    }

    public void clearField() {
        //TODO: Find solution
    }

    public void drawField(List fields) {
        int lengthOfLine = (int) Math.sqrt((double) fields.size());
        int k = 0;
        for (int i = 0; i < lengthOfLine; i++) {
            String output = "";
            for (int j = 0; j < lengthOfLine; j++, k++) {
                output += (fields.get(k) + "\t");
            }
            System.out.println(output);
        }
        log.info("Field created");
    }

}
