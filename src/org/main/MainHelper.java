package org.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import puzzle.core.FieldProcessor;
import puzzle.output.Presenter;

/**
 * Created by User on 22.10.2015.
 */
public class MainHelper {

    private ApplicationContext context;
    private GameStates state = null;
    private FieldProcessor fieldProcessor = null;
    private Presenter presenter = null;

    public void setContext (ApplicationContext context) {
        this.context = context;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void setFieldProcessor(FieldProcessor fieldProcessor) {
        this.fieldProcessor = fieldProcessor;
    }

    public GameStates getState() {
        return state;
    }

    public void setState(GameStates state) {
        this.state = state;
    }

    public void initialisation() {
        state = GameStates.PROCESS;

        //setFieldProcessor();
        fieldProcessor.setQuantity(16);
        fieldProcessor.createField();

        //setPresenter();
        presenter.createField(fieldProcessor.getValues());
    }

}
