package org.main;

import puzzle.core.FieldProcessor;
import puzzle.input.InputManager;
import puzzle.output.Presenter;

/**
 * Created by User on 22.10.2015.
 */
public class MainHelper {

    private GameStates state = null;
    private FieldProcessor fieldProcessor = null;
    private Presenter presenter = null;
    private InputManager inputManager = null;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void setFieldProcessor(FieldProcessor fieldProcessor) {
        this.fieldProcessor = fieldProcessor;
    }

    public void setInputManager(InputManager inputManager) {
        this.inputManager = inputManager;
    }

    public GameStates getState() {
        return state;
    }

    public void setState(GameStates state) {
        this.state = state;
    }

    public void initialisation() {
        state = GameStates.PROCESS;

        fieldProcessor.setQuantity(16);
        fieldProcessor.createField();

        presenter.createField(fieldProcessor.getValues());
    }

    public void play() {
        String input = null;

        if (fieldProcessor.isFinished()) {
            state = GameStates.FINISH_WIN;
        } if (!fieldProcessor.hasSolution()) {
            state = GameStates.FINISH_LOOSE;
        } else {
            //input = inputManager.getInput();
            input = presenter.getInput();
            fieldProcessor.moveTile(defineMovementDirection(input));
            presenter.drawField(fieldProcessor.getValues());
        }
    }

    public MovementDirections defineMovementDirection(String input) {
        MovementDirections direct = null;
        switch (input) {
            case "w":
                direct = MovementDirections.UP;
                break;
            case "a":
                direct = MovementDirections.LEFT;
                break;
            case "s":
                direct = MovementDirections.DOWN;
                break;
            case "d":
                direct = MovementDirections.RIGHT;
                break;
            default:
                break;
        }
        return direct;
    }

}
