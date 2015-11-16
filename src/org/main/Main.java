package org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import puzzle.core.FieldProcessor;
import puzzle.output.Presenter;

public class Main {

    public static ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    public static void main(String[] args) {

        MainHelper helper = (MainHelper) context.getBean("helper");
        helper.setContext(context);
        helper.initialisation();

        /*while (!(helper.getState().equals(GameStates.FINISH))) {

        }*/

    }
}
