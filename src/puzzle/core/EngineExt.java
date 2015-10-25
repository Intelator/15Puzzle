package puzzle.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by User on 21.10.2015.
 */
public class EngineExt extends Engine {
    private List<Integer> fields = new ArrayList<Integer>();
    private int quantity;

    public EngineExt() {
        super();
    }

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
                log.info("Value " + j + " added on " + i + "th position");
            }
        }
    }

    @Override //Работоспособность под вопросом
    public boolean isFinished() {
        int i = 0;
        while (i < quantity) {
            if (fields.get(i) != (i+1) ) {
                log.info("Game not over");
                return false;
            } else {
                i++;
            }
        }
        log.info("Game over");
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
        log.info(0 + " moved to " + finishTileIndex + "th position");
    }
}
