package com.maxjacobi.randomnamegenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public TextArea textArea;

    @Override
    public void start(Stage stage) {

        Label label = new Label("Press button for new random names");

        Button button = new Button("New random names");

        textArea = new TextArea();
        textArea.setEditable(false);

        VBox root = new VBox(label,button,textArea);

        Scene scene = new Scene(root,400,400);

        stage.setTitle("RandomNameGenerator");
        stage.setScene(scene);
        stage.show();

        newRandomNames(10,6);
    }

    public static void main(String[] args) {
        launch();
    }

    public void newRandomNames(int number, int length) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= number; i++) {
            builder.append(new RandomName(length).getName()).append("\n");
        }

        textArea.setText(builder.toString().trim());
    }
}