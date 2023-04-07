package com.hedans.edumanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginForm {


    public AnchorPane context;

    public void LoginButtonInAction(ActionEvent actionEvent) throws IOException {

    setUi("SignUpForm");

    }



    private void setUi(String location) throws IOException {

       Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../view/" + location + ".fxml"))));
        stage.centerOnScreen();
    }
    public void CrearAnAccountButtonInAction(ActionEvent actionEvent) {
    }

    public void ForgotpasswordAction(ActionEvent actionEvent) {
    }

    public void textLoginInAction(ActionEvent actionEvent) {

        //dont use
    }

    public void textPasswordInAction(ActionEvent actionEvent) {
        //dont use
    }
}
