package com.maxjacobi.randomnamegenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Label label = new Label("Press button for new random names");

        Button button = new Button("New random names");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        VBox root = new VBox(label,button,textArea);

        Scene scene = new Scene(root,400,400);

        stage.setTitle("RandomNameGenerator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}