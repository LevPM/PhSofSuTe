package ru.riddle.model.menu;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import ru.riddle.model.util.FXMLs;
import ru.riddle.model.util.ModelUtil;

public class MenuModel {

    public void openSettingsScreen(ActionEvent event){
        ModelUtil.changeScreen(event, FXMLs.SETTINGS_SCREEN);
    }

    public void openAuthorsScreen(ActionEvent event){
        ModelUtil.changeScreen(event, FXMLs.AUTHORS_SCREEN);
    }

    public void backToMenuScreen(ActionEvent event){
        ModelUtil.changeScreen(event, FXMLs.MENU_SCREEN);
    }

    public void closeApp(){
        Platform.exit();
        System.exit(0);
    }

    public void openMenuFormulasScreen(ActionEvent event){
        ModelUtil.changeScreen(event, FXMLs.MENU_FORMULAS_SCREEN);
    }
}
