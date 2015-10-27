package org.main;

import puzzle.core.Engine;
import puzzle.core.EngineImpl;
import puzzle.output.Presenter;
import puzzle.output.PresenterCLImpl;
import puzzle.output.PresenterSwing;

public class Main {


    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        //Presenter presenter = new PresenterCLImpl();
        Presenter presenter = new PresenterSwing();

        engine.setQuantity(16);
        engine.createField();
        presenter.drawField(engine.getValues());
    }
}
