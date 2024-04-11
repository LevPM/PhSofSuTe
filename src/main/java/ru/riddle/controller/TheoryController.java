package ru.riddle.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import ru.riddle.model.theory.TheoryModel;
import ru.riddle.model.util.FXMLs;
import ru.riddle.model.util.ModelUtil;

public class TheoryController {

    private final TheoryModel model;

    public TheoryController(){
        model = new TheoryModel();
    }

    public void handleLeaveButtonAction(ActionEvent event) {
        model.leaveTheory(event);
    }

    public void handleNextButtonAction(ActionEvent event) {
        model.goToNextScreen(event);
    }

    public void handlePreviousButtonAction(ActionEvent event) {
        model.backToPreviousScreen(event);
    }

    public void handleExampleButtonAction(ActionEvent event) {
        String id = ((Node) (event.getSource())).getId();
        ModelUtil.changeScreen(event,
                switch (id){
                    case "FirstExample" -> ModelUtil.downloadRoot(FXMLs.firstExample.getFirst());
                    case "SecondExample" -> ModelUtil.downloadRoot(FXMLs.secondExample.getFirst());
                    default -> throw new IllegalStateException("Unexpected value: " + id);
                });
    }
}
