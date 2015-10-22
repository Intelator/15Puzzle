package puzzle.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 21.10.2015.
 */
public class EngineImpl implements Engine {
    private List<Integer> fields = new ArrayList<Integer>();
    private int quantity;

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void createField() {
        ArrayList<Integer> tempList = new ArrayList<Integer>(quantity);
        for (int i = 0; i < quantity; i++) {
            tempList.add(i, i);
        }

        int i = 0;
        while (i < quantity) {
            int j = (int) (Math.random() * (quantity));

            if (!(tempList.get(j) == -1)) {
                fields.add(i,j);
                tempList.set(j, -1);
                i++;
            }
        }
    }

    @Override //Работоспособность под вопросом
    public boolean isFinished() {
        int i = 0;
        while (i < quantity) {
            if (fields.get(i) != (i+1) ) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    @Override
    public List<Integer> getValues() {
        return fields;
    }

    @Override
    public void moveTile(int direction) {
        int startTileIndex = fields.indexOf(0);
        int finishTileIndex = startTileIndex + direction;
        int finishTileValue = fields.get(finishTileIndex);
        fields.set(startTileIndex, finishTileValue);
        fields.set(finishTileIndex, 0);
    }
}
