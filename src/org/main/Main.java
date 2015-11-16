package org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import puzzle.core.FieldProcessor;
import puzzle.output.Presenter;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        FieldProcessor fieldProcessor = (FieldProcessor) context.getBean("fieldProcessor");

        fieldProcessor.setQuantity(16);
        fieldProcessor.createField();

        Presenter presenter = (Presenter) context.getBean("presenter");
        presenter.createField(fieldProcessor.getValues());


    }
}
