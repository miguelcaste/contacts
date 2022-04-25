package com.castelar.contacts.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactsApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ContactsApplication.class.getResource("other-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Contacts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}