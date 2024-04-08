package ru.riddle.model.util;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ModelUtil {

    public static void changeScreen(ActionEvent event, Parent root){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        double height = stage.getHeight();
        double width = stage.getWidth();
        boolean isFullScreen = stage.isFullScreen();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setHeight(height);
        stage.setWidth(width);
        stage.setFullScreen(isFullScreen);
        stage.show();
    }

    public static Parent downloadRoot(FXMLsPaths fxml){
        try {
            return FXMLLoader.load(ModelUtil.class.getResource(fxml.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}