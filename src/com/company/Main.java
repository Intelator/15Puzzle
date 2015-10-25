package com.company;

import puzzle.core.Engine;
import puzzle.core.EngineImpl;
import puzzle.output.Presenter;
import puzzle.output.PresenterCLImpl;

public class Main {


    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        Presenter presenter = new PresenterCLImpl();

        engine.setQuantity(16);
        engine.createField();
        presenter.drawField(engine.getValues());
    }
}
