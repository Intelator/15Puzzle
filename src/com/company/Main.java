package com.company;

import puzzle.core.Engine;
import puzzle.core.EngineExt;
import puzzle.output.Presenter;
import puzzle.output.PresenterCLExt;

public class Main {


    public static void main(String[] args) {
        Engine engine = new EngineExt();
        Presenter presenter = new PresenterCLExt();

        engine.setQuantity(16);
        engine.createField();
        presenter.drawField(engine.getValues());
    }
}
