package puzzle.core;

import java.util.List;

/**
 * Created by User on 21.10.2015.
 */
public interface Engine {
    List<Integer> fields = null;
    int quantity = 0;

    public void createField();
    //TODO public boolean hasSolvation(List<Integer> fields);
    public boolean isFinished();
    public void moveTile(int direction);
    public List<Integer> getValues();
    public void setQuantity(int quantity);
}
