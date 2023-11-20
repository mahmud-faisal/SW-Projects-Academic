package com.example.swi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.swi.HelloApplication.loadFXML;

public class Home {
    private Stage stage;
    private Scene scene;
    @FXML
    public void onNavClick(ActionEvent event) throws IOException {
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
//        stage=new Stage();
        scene =new Scene(loadFXML("HomeNav"));
        stage.setHeight(640);
        stage.setWidth(360);
        stage.setScene(scene);
        stage.show();
    }
}
