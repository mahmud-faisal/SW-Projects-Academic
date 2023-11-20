package com.example.swi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.swi.HelloApplication.loadFXML;

public class Register {
    private Scene scene;
    private Stage stage;
    @FXML
    private void onLogin(ActionEvent event) throws IOException {
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(loadFXML("Login"));
        stage.setHeight(640);
        stage.setWidth(360);
        stage.setScene(scene);
        stage.show();
    }
}
