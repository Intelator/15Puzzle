package puzzle.core;

import org.main.MovementDirections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 21.10.2015.
 */
public class FieldProcessorImpl extends FieldProcessor {
    private List<Integer> fields = new ArrayList<Integer>();
    private int quantity;

    public FieldProcessorImpl() {
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
        log.info("Game over, won");
        return true;
    }

    @Override
    public boolean hasSolution() {
        return true; //TODO realize
    }

    @Override
    public boolean isMovePossible(MovementDirections direct) {
        int currentIndex = fields.indexOf(0);
        int tilesInLine = (int) Math.sqrt(fields.size());
        boolean isPossible = false;
        Integer modulo = 0;

        switch (direct) {
            case UP:
                if (currentIndex < tilesInLine) {
                    isPossible = false;
                } else  isPossible = true;
                break;
            case DOWN:
                if (currentIndex > tilesInLine*(tilesInLine - 1)) {
                    isPossible = false;
                } else isPossible = true;
                break;
            case LEFT:
                modulo = currentIndex%tilesInLine;
                if (modulo.equals(0)) {
                    isPossible = false;
                } else isPossible = true;
                break;
            case RIGHT:
                modulo = currentIndex%tilesInLine + 1;
                if (modulo.equals(0)) {
                    isPossible = false;
                } else isPossible = true;
                break;
            default:
                break;
        }

        return isPossible;
    }

    @Override
    public List<Integer> getValues() {
        return fields;
    }

    @Override
    public void moveTile(MovementDirections direct) {
        int shift = 0;
        int tilesInLine = (int) Math.sqrt(fields.size());

        switch (direct) {
            case UP:
                if (isMovePossible(direct)) {
                    shift = -tilesInLine;
                }
                break;
            case DOWN:
                if (isMovePossible(direct)) {
                    shift = tilesInLine;
                }
                break;
            case LEFT:
                if (isMovePossible(direct)) {
                    shift = -1;
                }
                break;
            case RIGHT:
                if (isMovePossible(direct)) {
                    shift = 1;
                }
                break;
            default:
                log.info("Invalid direction of movement");
                break;
        }

        int startTileIndex = fields.indexOf(0);
        int finishTileIndex = startTileIndex + shift;
        int finishTileValue = fields.get(finishTileIndex);
        fields.set(startTileIndex, finishTileValue);
        fields.set(finishTileIndex, 0);
        log.info(0 + " moved to " + finishTileIndex + "th position");
    }
}
