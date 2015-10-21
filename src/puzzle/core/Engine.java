package puzzle.core;

import java.util.List;

/**
 * Created by User on 21.10.2015.
 */
public interface Engine {
    List<Integer> fields = null;

    public void createField(int quantity);
    public boolean hasSolvation(List<Integer> fields);
    public boolean isFinished(List<Integer> fields);
    public void moveTile(int direction);
    public List<Integer> getValues();

}
