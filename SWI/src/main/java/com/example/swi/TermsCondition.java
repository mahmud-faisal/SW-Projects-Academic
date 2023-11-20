package com.example.swi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.swi.HelloApplication.loadFXML;

public class TermsCondition {
    private Stage stage;
    private Scene scene;
    @FXML
    private void onConfirm(ActionEvent event) throws IOException {
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(loadFXML("Login"));
        stage.setScene(scene);
        stage.show();
    }
}
