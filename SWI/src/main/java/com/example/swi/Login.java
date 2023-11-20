package com.example.swi;

import backend.LoginCheck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import static com.example.swi.HelloApplication.loadFXML;

public class Login {
    private Stage stage;
    private Scene scene;
    @FXML
    private void forgetPass(ActionEvent event) throws IOException {
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(loadFXML("ForgotPassword"));
        stage.setHeight(640);
        stage.setWidth(360);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void onRegister(ActionEvent event) throws IOException {
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(loadFXML("Register"));
        stage.setHeight(640);
        stage.setWidth(360);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private TextField userIdUser;
    @FXML
    private TextField userPassUser;
    @FXML
    private Label caution;
    private String id;
    private String password;

    public String getPassword() {
        return password;
    }
    public  Login(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public  Login(String id,String password){
        this.id=id;
        this.password=password;
    }

    public  void sendToBackEnd(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        Login ali=new Login(userIdUser.getText(),userPassUser.getText());
        LoginCheck d=new LoginCheck();
        boolean checked=d.checkInBE(ali.getId() ,ali.getPassword(),"user_info");
        if(checked){

            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(loadFXML("Home"));
            stage.setScene(scene);
            stage.show();



        }
        else{
            caution.setText("Wrong User Id or Password");

        }

    }

}
