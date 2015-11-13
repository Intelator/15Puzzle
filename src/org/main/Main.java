package org.main;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import puzzle.core.Engine;
import puzzle.core.EngineImpl;
import puzzle.output.Presenter;
import puzzle.output.PresenterCLImpl;
import puzzle.output.PresenterSwing;
import org.apache.commons.logging.LogFactory;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Engine engine = (Engine) context.getBean("engine");

        engine.setQuantity(16);
        engine.createField();

        Presenter presenter = (Presenter) context.getBean("presenter");
        presenter.createField(engine.getValues());


    }
}
